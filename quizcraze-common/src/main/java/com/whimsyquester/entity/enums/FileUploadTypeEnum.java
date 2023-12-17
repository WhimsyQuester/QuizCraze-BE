package com.whimsyquester.entity.enums;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.enums
 * @ClassName: FileUploadTypeEnum
 * @Datetime: 2023/11/20 04:03
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示文件上传类型
 */

public enum FileUploadTypeEnum {
    CATEGORY(0, 150, "分类图片"), Carousel(1, 400, "轮播图"), SHARE_LARGE(2, 400, "分享大图"), SHARE_SMALL(3, 100, "分享小图");

    private final Integer type;
    private final Integer maxWidth;
    private final String description;

    FileUploadTypeEnum(Integer type, Integer maxWidth, String description) {
        this.type = type;
        this.maxWidth = maxWidth;
        this.description = description;
    }

    public static FileUploadTypeEnum getType(Integer type) {
        for (FileUploadTypeEnum at : FileUploadTypeEnum.values()) {
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

    public Integer getMaxWidth() {
        return maxWidth;
    }
}

