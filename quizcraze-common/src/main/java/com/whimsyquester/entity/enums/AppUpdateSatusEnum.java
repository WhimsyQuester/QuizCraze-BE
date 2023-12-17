package com.whimsyquester.entity.enums;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.enums
 * @ClassName: AppUpdateSatusEnum
 * @Datetime: 2023/11/20 03:56
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: app更新状态
 */

public enum AppUpdateSatusEnum {
    INIT(0, "未发布"), GRAYSCALE(1, "灰度发布"), ALL(2, "全网发布");

    private final Integer status;
    private final String description;

    AppUpdateSatusEnum(int status, String description) {
        this.status = status;
        this.description = description;
    }

    public static AppUpdateSatusEnum getByStatus(Integer status) {
        for (AppUpdateSatusEnum at : AppUpdateSatusEnum.values()) {
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

