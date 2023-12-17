package com.whimsyquester.entity.enums;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.enums
 * @ClassName: MenuCheckTypeEnum
 * @Datetime: 2023/11/20 04:04
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示菜单选中类型
 */

public enum MenuCheckTypeEnum {
    ALL(1, "全选"), HALF(0, "半选");

    private Integer type;
    private String desc;

    MenuCheckTypeEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}

