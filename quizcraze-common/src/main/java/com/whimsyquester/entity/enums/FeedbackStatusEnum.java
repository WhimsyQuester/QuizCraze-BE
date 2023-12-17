package com.whimsyquester.entity.enums;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.enums
 * @ClassName: FeedbackStatusEnum
 * @Datetime: 2023/11/20 04:03
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示反馈的状态
 */


public enum FeedbackStatusEnum {
    NO_REPLY(0, "未回复"), REPLY(1, "已回复");

    private final Integer status;
    private final String description;

    FeedbackStatusEnum(int status, String description) {
        this.status = status;
        this.description = description;
    }

    public static FeedbackStatusEnum getByStatus(Integer status) {
        for (FeedbackStatusEnum at : FeedbackStatusEnum.values()) {
            if (at.status.equals(status)) {
                return at;
            }
        }
        return null;
    }

    public Integer getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }
}

