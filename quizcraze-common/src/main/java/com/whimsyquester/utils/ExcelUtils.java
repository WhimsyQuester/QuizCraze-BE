package com.whimsyquester.utils;

import com.whimsyquester.exception.BusinessException;
import org.apache.poi.ss.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.utils
 * @ClassName: ExcelUtils
 * @Datetime: 2023/11/19 23:33
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 一个Excel文件处理的工具类ExcelUtils
 */

public class ExcelUtils {

    private static final Logger logger = LoggerFactory.getLogger(ExcelUtils.class);

    /**
     * @param file
     * @param title
     * @param startRowIndex
     * @return List<List<String>>
     * @description 读取Excel文件并解析其内容
     */
    public static List<List<String>> readExcel(MultipartFile file, String[] title, Integer startRowIndex) {
        InputStream is = null;
        Integer rowIndex = 0;
        try {
            is = file.getInputStream();
            Workbook workbook = WorkbookFactory.create(is);
            //循环每一页，并处理当前的循环页
            List<List<String>> listData = new ArrayList<>();
            Sheet sheet = workbook.getSheetAt(0);
            if (sheet == null) {
                throw new BusinessException("excel文件解析失败");
            }
            for (int rowNumIndex = 0; rowNumIndex <= sheet.getLastRowNum(); rowNumIndex++) {
                rowIndex = rowNumIndex;
                if (rowNumIndex < startRowIndex) {
                    continue;
                }
                List<String> rowData = new ArrayList<>();
                //Row表示每一行的数据
                Row row = sheet.getRow(rowNumIndex);
                if (row == null) {
                    continue;
                }
                int maxColIx = title.length;
                //遍历该行，并获取每一个cell的数据
                Boolean allEmpty = true;

                if (row.getLastCellNum() < maxColIx) {
                    throw new BusinessException("请按照模板文件上传数据");
                }

                for (int colIx = 0; colIx < maxColIx; colIx++) {
                    Cell cell = row.getCell(colIx);
                    String cellValue = cell == null ? "" : getXValue(cell).replace("`", "");
                    rowData.add(cellValue);
                    if (!StringTools.isEmpty(cellValue)) {
                        allEmpty = false;
                    }
                }
                /**
                 * 校验标题是否吻合
                 */
                if (rowNumIndex == startRowIndex) {
                    String dataTitle = rowData.stream().collect(Collectors.joining("_"));
                    String titleStr = Arrays.asList(title).stream().collect(Collectors.joining("_"));
                    if (!dataTitle.equalsIgnoreCase(titleStr)) {
                        throw new BusinessException("请按照模板文件上传数据");
                    }
                }
                //所有数据都是空不记录
                if (allEmpty) {
                    continue;
                }
                if (rowNumIndex > startRowIndex) {
                    listData.add(rowData);
                }
            }
            return listData;
        } catch (BusinessException e) {
            logger.info("文件解析错误，第:{}行", rowIndex + 1, e);
            throw e;
        } catch (Exception e) {
            logger.info("文件解析错误，第:{}行", rowIndex + 1, e);
            throw new BusinessException("文件第" + (rowIndex + 1) + "行解析错误");
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    throw new BusinessException(e);
                }
            }
        }
    }

    /**
     * @param cell
     * @return String
     * @description 用于获取单元格的值
     */
    private static String getXValue(Cell cell) {
        if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
            DecimalFormat df = new DecimalFormat("#.##");
            return df.format(cell.getNumericCellValue());
        } else {
            String value = cell.getStringCellValue();
            return StringTools.isEmpty(value) ? "" : value.trim();
        }
    }
}

