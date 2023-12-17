package com.whimsyquester.entity.enums;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.enums
 * @ClassName: MenuTypeEnum
 * @Datetime: 2023/11/20 04:05
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示菜单的类型
 */

public enum MenuTypeEnum {
    MEMU(0, "菜单"), BUTTON(1, "按钮");

    private Integer type;
    private String desc;

    MenuTypeEnum(Integer type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public static MenuTypeEnum getMenuTypeByType(Integer type) {
        if (null == type) {
            return null;
        }
        for (MenuTypeEnum item : MenuTypeEnum.values()) {
            if (item.getType().equals(type)) {
                return item;
            }
        }
        return null;
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

