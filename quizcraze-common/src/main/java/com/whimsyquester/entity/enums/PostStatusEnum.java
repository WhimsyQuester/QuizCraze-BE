package com.whimsyquester.entity.enums;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.enums
 * @ClassName: PostStatusEnum
 * @Datetime: 2023/11/20 04:06
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示帖子的发布状态
 */

public enum PostStatusEnum {
    NO_POST(0, "待发布"), POST(1, "已发布");

    private final Integer status;
    private final String description;

    PostStatusEnum(int status, String description) {
        this.status = status;
        this.description = description;
    }

    public static PostStatusEnum getByStatus(Integer status) {
        for (PostStatusEnum at : PostStatusEnum.values()) {
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

