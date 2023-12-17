package com.whimsyquester.entity.enums;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.enums
 * @ClassName: FeedbackSendTypeEnum
 * @Datetime: 2023/11/20 04:03
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示反馈发送类型
 */

public enum FeedbackSendTypeEnum {
    CLIENT(0, "访客"), ADMIN(1, "管理员");

    private final Integer status;
    private final String description;

    FeedbackSendTypeEnum(int status, String description) {
        this.status = status;
        this.description = description;
    }

    public static FeedbackSendTypeEnum getByStatus(Integer status) {
        for (FeedbackSendTypeEnum at : FeedbackSendTypeEnum.values()) {
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

