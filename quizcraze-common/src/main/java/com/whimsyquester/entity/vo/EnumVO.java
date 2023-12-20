package com.whimsyquester.entity.vo;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.vo.app
 * @ClassName: EnumVO
 * @Datetime: 2023/11/19 23:13
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示枚举类型的值和文本
 */

public class EnumVO {
    private String value;
    private String text;

    public EnumVO(String value, String text) {
        this.value = value;
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

