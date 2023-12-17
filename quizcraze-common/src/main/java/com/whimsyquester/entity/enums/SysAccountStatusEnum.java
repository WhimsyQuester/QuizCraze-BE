package com.whimsyquester.entity.enums;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.enums
 * @ClassName: SysAccountStatusEnum
 * @Datetime: 2023/11/20 04:09
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示系统账户的状态
 */

public enum SysAccountStatusEnum {
    DISABLE(0, "禁用"), ENABLE(1, "启用");

    private final Integer status;
    private final String description;

    SysAccountStatusEnum(int status, String description) {
        this.status = status;
        this.description = description;
    }

    public static SysAccountStatusEnum getByStatus(Integer status) {
        for (SysAccountStatusEnum at : SysAccountStatusEnum.values()) {
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
