package com.whimsyquester.entity.dto;

import java.util.List;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.dto
 * @ClassName: StatisticsDataDto
 * @Datetime: 2023/11/20 02:09
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 用于在应用程序的不同层之间传输与统计数据相关的数据
 */

public class StatisticsDataDto {
    private String statisticsName; // 统计数据的名称
    private Integer count; // 当前统计数据的计数
    private Integer preCount; // 之前的统计数据计数
    private List<Integer> listData; // 统计数据的列表

    public String getStatisticsName() {
        return statisticsName;
    }

    public void setStatisticsName(String statisticsName) {
        this.statisticsName = statisticsName;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getPreCount() {
        return preCount;
    }

    public void setPreCount(Integer preCount) {
        this.preCount = preCount;
    }

    public List<Integer> getListData() {
        return listData;
    }

    public void setListData(List<Integer> listData) {
        this.listData = listData;
    }
}
