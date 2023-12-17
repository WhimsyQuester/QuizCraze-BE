package com.whimsyquester.entity.enums;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.enums
 * @ClassName: PostUserTypeEnum
 * @Datetime: 2023/11/20 04:07
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示帖子用户的类型
 */

public enum PostUserTypeEnum {
    INNER(0, "内部用户"), OUTER(1, "外部访客");

    private final Integer result;
    private final String description;

    PostUserTypeEnum(int result, String description) {
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

