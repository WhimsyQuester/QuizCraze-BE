package com.whimsyquester.entity.dto;

import java.util.List;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.dto
 * @ClassName: ImportErrorItem
 * @Datetime: 2023/11/20 02:04
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 用于在应用程序的不同层之间传输导入错误的数据项
 */

public class ImportErrorItem {
    private Integer rowNum; // 行号，表示导入错误的数据项所在的行号
    private List<String> errorItemList; // 错误项列表，表示导入错误的具体数据项

    public Integer getRowNum() {
        return rowNum;
    }

    public void setRowNum(Integer rowNum) {
        this.rowNum = rowNum;
    }

    public List<String> getErrorItemList() {
        return errorItemList;
    }

    public void setErrorItemList(List<String> errorItemList) {
        this.errorItemList = errorItemList;
    }
}


