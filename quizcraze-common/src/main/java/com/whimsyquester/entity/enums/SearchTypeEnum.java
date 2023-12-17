package com.whimsyquester.entity.enums;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.enums
 * @ClassName: SearchTypeEnum
 * @Datetime: 2023/11/20 04:08
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示搜索的类型
 */

public enum SearchTypeEnum {
    QUESTION(0, "搜索问题"), EXAM_QUESTION(1, "搜索考题"), SHARE(2, "分享");

    private final Integer type;
    private final String description;

    SearchTypeEnum(int type, String description) {
        this.type = type;
        this.description = description;
    }

    public static SearchTypeEnum getByType(Integer type) {
        for (SearchTypeEnum at : SearchTypeEnum.values()) {
            if (at.getType().equals(type)) {
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

