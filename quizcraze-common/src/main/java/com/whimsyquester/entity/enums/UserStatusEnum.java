package com.whimsyquester.entity.enums;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.enums
 * @ClassName: UserStatusEnum
 * @Datetime: 2023/11/20 04:09
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示用户的状态
 */

public enum UserStatusEnum {

    DISABLE(0, "禁用"),
    ENABLE(1, "启用");

    private final Integer status;
    private String desc;

    UserStatusEnum(Integer status, String desc) {
        this.status = status;
        this.desc = desc;
    }

    public static UserStatusEnum getByStatus(Integer status) {
        for (UserStatusEnum item : UserStatusEnum.values()) {
            if (item.getStatus().equals(status)) {
                return item;
            }
        }
        return null;
    }

    public Integer getStatus() {
        return status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
