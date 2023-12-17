package com.whimsyquester.entity.enums;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.enums
 * @ClassName: AppUpdateTypeEnum
 * @Datetime: 2023/11/20 03:56
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: app更新类型
 */

public enum AppUpdateTypeEnum {
    ALL(0, ".apk", "全更新"), WGT(1, ".wgt", "局部热更新");

    private final Integer type;
    private final String suffix;
    private final String description;

    AppUpdateTypeEnum(int type, String suffix, String description) {
        this.type = type;
        this.suffix = suffix;
        this.description = description;
    }

    public static AppUpdateTypeEnum getByType(Integer type) {
        for (AppUpdateTypeEnum at : AppUpdateTypeEnum.values()) {
            if (at.getType().equals(type)) {
                return at;
            }
        }
        return null;
    }

    public Integer getType() {
        return type;
    }

    public String getSuffix() {
        return suffix;
    }

    public String getDescription() {
        return description;
    }
}

