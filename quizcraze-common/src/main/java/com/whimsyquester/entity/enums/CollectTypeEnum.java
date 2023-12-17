package com.whimsyquester.entity.enums;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.enums
 * @ClassName: CollectTypeEnum
 * @Datetime: 2023/11/20 04:01
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 收藏类型
 */

public enum CollectTypeEnum {
    SHARE(0, "分享收藏"), QUESTION(1, "八股文"), EXAM(2, "考题");

    private final Integer type;
    private final String description;

    CollectTypeEnum(int type, String description) {
        this.type = type;
        this.description = description;
    }

    public static CollectTypeEnum getByType(Integer type) {
        for (CollectTypeEnum at : CollectTypeEnum.values()) {
            if (at.type.equals(type)) {
                return at;
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

