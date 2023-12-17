package com.whimsyquester.entity.enums;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.enums
 * @ClassName: QuestionTypeEnum
 * @Datetime: 2023/11/20 04:07
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示问题的类型
 */

public enum QuestionTypeEnum {

    TRUE_FALSE(0, "判断题"),
    RADIO(1, "单选题"),
    CHECK_BOX(2, "多选题");


    private final Integer type;
    private final String desc;

    QuestionTypeEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public static QuestionTypeEnum getByDesc(String desc) {
        for (QuestionTypeEnum item : QuestionTypeEnum.values()) {
            if (item.getDesc().equals(desc)) {
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

