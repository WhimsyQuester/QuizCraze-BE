package com.whimsyquester.entity.enums;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.enums
 * @ClassName: AppExamStatusEnum
 * @Datetime: 2023/11/20 03:55
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: app测验状态
 */

public enum AppExamStatusEnum {
    INIT(0, "未完成"), FINISHED(1, "完成");

    private final Integer status;
    private final String description;

    AppExamStatusEnum(int status, String description) {
        this.status = status;
        this.description = description;
    }

    public Integer getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

}

