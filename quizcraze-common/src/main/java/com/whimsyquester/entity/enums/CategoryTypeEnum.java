package com.whimsyquester.entity.enums;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.enums
 * @ClassName: CategoryTypeEnum
 * @Datetime: 2023/11/20 03:57
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 试题分类
 */

public enum CategoryTypeEnum {

    QUESTION(0, "八股文分类"),
    EXAM(1, "考题分类"),
    QUESTION_EXAM(2, "八股文分类和考题分类");


    private final Integer type;
    private final String desc;

    CategoryTypeEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public static CategoryTypeEnum getByType(Integer type) {
        for (CategoryTypeEnum item : CategoryTypeEnum.values()) {
            if (item.getType().equals(type)) {
                return item;
            }
        }
        return null;
    }

    public Integer getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}

