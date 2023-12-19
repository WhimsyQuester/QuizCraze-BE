package com.whimsyquester.entity.dto;

import java.util.List;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.dto
 * @ClassName: StatisticsDataWeekDto
 * @Datetime: 2023/11/20 02:10
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 用于在应用程序的不同层之间传输与周统计数据相关的数据
 */

public class StatisticsDataWeekDto {
    private List<String> dateList;  // 日期列表
    private List<StatisticsDataDto> itemDataList;   // 统计数据项列表

    public List<String> getDateList() {
        return dateList;
    }

    public void setDateList(List<String> dateList) {
        this.dateList = dateList;
    }

    public List<StatisticsDataDto> getItemDataList() {
        return itemDataList;
    }

    public void setItemDataList(List<StatisticsDataDto> itemDataList) {
        this.itemDataList = itemDataList;
    }
}
