package com.whimsyquester.entity.po;

import com.whimsyquester.annotation.VerifyParam;
import com.whimsyquester.entity.enums.MenuTypeEnum;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.po
 * @ClassName: SysMenu
 * @Datetime: 2023/11/20 02:50
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示菜单表
 */

@SuppressWarnings("serial")
public class SysMenu implements Serializable {


    /**
     * menu_id，自增主键
     */
    private Integer menuId;

    /**
     * 菜单名
     */
    @VerifyParam(required = true, max = 32)
    private String menuName;

    /**
     * 菜单类型 0：菜单 1：按钮
     */
    @VerifyParam(required = true)
    private Integer menuType;

    /**
     * 菜单跳转到的地址
     */
    private String menuUrl;

    /**
     * 上级菜单ID
     */
    @VerifyParam(required = true)
    private Integer pId;

    /**
     * 菜单排序
     */
    @VerifyParam(required = true)
    private Integer sort;

    /**
     * 权限编码
     */
    @VerifyParam(max = 50)
    private String permissionCode;

    /**
     * 图标
     */
    @VerifyParam(max = 50)
    private String icon;

    private Boolean disabled;

    private String menuTypeName;

    private List<SysMenu> children = new ArrayList<>();

    public Integer getMenuId() {
        return this.menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return this.menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getMenuType() {
        return this.menuType;
    }

    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    public String getMenuUrl() {
        return this.menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public Integer getpId() {
        return this.pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getSort() {
        return this.sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getPermissionCode() {
        return this.permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<SysMenu> getChildren() {
        return children;
    }

    public void setChildren(List<SysMenu> children) {
        this.children = children;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public String getMenuTypeName() {
        MenuTypeEnum menuTypeEnums = MenuTypeEnum.getMenuTypeByType(menuType);
        return menuTypeEnums == null ? "" : menuTypeEnums.getDesc();
    }

    public void setMenuTypeName(String menuTypeName) {
        this.menuTypeName = menuTypeName;
    }

    @Override
    public String toString() {
        return "menu_id，自增主键:" + (menuId == null ? "空" : menuId) + "，菜单名:" + (menuName == null ? "空" : menuName) + "，菜单类型 0：菜单 1：按钮:" + (menuType == null ? "空" :
                menuType) + "，菜单跳转到的地址:" + (menuUrl == null ? "空" : menuUrl) + "，上级菜单ID:" + (pId == null ? "空" : pId) + "，菜单排序:" + (sort == null ? "空" : sort) +
                "，权限编码:" + (permissionCode == null ? "空" : permissionCode) + "，图标:" + (icon == null ? "空" :
                icon);
    }

    public boolean equals(Object obj) {
        if (obj instanceof SysMenu) {
            SysMenu name = (SysMenu) obj;
            return (menuId.equals(name.menuId));
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return menuId.hashCode();

    }
}

