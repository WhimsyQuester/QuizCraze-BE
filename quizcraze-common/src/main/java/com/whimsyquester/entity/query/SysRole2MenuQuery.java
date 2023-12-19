package com.whimsyquester.entity.query;


/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.query
 * @ClassName: SysRole2MenuQuery
 * @Datetime: 2023/11/20 02:52
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 用于表示角色对应的菜单权限信息的查询条件
 */

public class SysRole2MenuQuery extends BaseParam {

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

}
