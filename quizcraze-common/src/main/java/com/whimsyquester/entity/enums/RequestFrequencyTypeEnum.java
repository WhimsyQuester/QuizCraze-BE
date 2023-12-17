package com.whimsyquester.entity.enums;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.enums
 * @ClassName: RequestFrequencyTypeEnum
 * @Datetime: 2023/11/20 04:07
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示请求频率的类型
 */

public enum RequestFrequencyTypeEnum {
    DAY(60 * 60 * 24, "一天"), HOUR(60 * 60, "一小时"), MINUTE(60, "一分钟"), SECONDS(1, "一秒"), NO_LIMIT(0, "不限制");

    private Integer seconds;
    private String desc;
    RequestFrequencyTypeEnum(Integer seconds, String desc) {
        this.seconds = seconds;
        this.desc = desc;
    }

    public Integer getSeconds() {
        return seconds;
    }

    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}

