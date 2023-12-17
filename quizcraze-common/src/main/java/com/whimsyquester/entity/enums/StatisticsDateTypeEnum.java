package com.whimsyquester.entity.enums;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.enums
 * @ClassName: StatisticsDateTypeEnum
 * @Datetime: 2023/11/20 04:09
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示统计日期的类型
 */

public enum StatisticsDateTypeEnum {
    APP_DOWNLOAD(0, "App下载"), REGISTER_USER(1, "注册用户"), QUESTION_INFO(3, "八股文"),
    EXAM(4, "考题"), SHARE(5, "分享"), FEEDBACK(6, "反馈");

    private final Integer type;
    private final String description;

    StatisticsDateTypeEnum(Integer type, String description) {
        this.type = type;
        this.description = description;
    }

    public static StatisticsDateTypeEnum getByType(Integer type) {
        for (StatisticsDateTypeEnum item : StatisticsDateTypeEnum.values()) {
            if (item.getType().equals(type)) {
                return item;
            }
        }
        return null;
    }

    public Integer getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}

