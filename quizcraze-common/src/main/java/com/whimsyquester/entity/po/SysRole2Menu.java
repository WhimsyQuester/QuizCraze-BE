package com.whimsyquester.entity.po;

import java.io.Serializable;


/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.po
 * @ClassName: SysRole2Menu
 * @Datetime: 2023/11/20 02:52
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示角色对应的菜单权限信息
 */

public class SysRole2Menu implements Serializable {


    /**
     * 角色ID
     */
    private Integer roleId;

    /**
     * 菜单ID
     */
    private Integer menuId;

    /**
     * 0:半选 1:全选
     */
    private Integer checkType;

    public Integer getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return this.menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getCheckType() {
        return this.checkType;
    }

    public void setCheckType(Integer checkType) {
        this.checkType = checkType;
    }

    @Override
    public String toString() {
        return "角色ID:" + (roleId == null ? "空" : roleId) + "，菜单ID:" + (menuId == null ? "空" : menuId) + "，0:半选 1:全选:" + (checkType == null ? "空" : checkType);
    }
}

