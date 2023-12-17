package com.whimsyquester.entity.enums;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.enums
 * @ClassName: AnswerResultEnum
 * @Datetime: 2023/11/20 03:54
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 作答结果
 */

public enum AnswerResultEnum {
    INIT(0, "未作答"), RIGHT(1, "正确"), WRONG(2, "错误");

    private final Integer result;
    private final String description;

    AnswerResultEnum(int result, String description) {
        this.result = result;
        this.description = description;
    }

    public Integer getResult() {
        return result;
    }

    public String getDescription() {
        return description;
    }
}

