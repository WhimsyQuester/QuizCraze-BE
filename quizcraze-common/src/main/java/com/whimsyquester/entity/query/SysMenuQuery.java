package com.whimsyquester.entity.query;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.query
 * @ClassName: SysMenuQuery
 * @Datetime: 2023/11/20 02:50
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 用于表示菜单表参数的查询条件
 */

public class SysMenuQuery extends BaseParam {

    /**
     * menu_id，自增主键
     */
    private Integer menuId;

    /**
     * 菜单名
     */
    private String menuName;

    private String menuNameFuzzy;

    /**
     * 菜单类型 0：菜单 1：按钮
     */
    private Integer menuType;

    /**
     * 菜单跳转到的地址
     */
    private String menuUrl;

    private String menuUrlFuzzy;

    /**
     * 上级菜单ID
     */
    private Integer pId;

    /**
     * 菜单排序
     */
    private Integer sort;

    /**
     * 权限编码
     */
    private String permissionCode;

    private String permissionCodeFuzzy;

    /**
     * 图标
     */
    private String icon;

    private String iconFuzzy;

    private Boolean formate2Tree;

    public Boolean getFormate2Tree() {
        return formate2Tree;
    }

    public void setFormate2Tree(Boolean formate2Tree) {
        this.formate2Tree = formate2Tree;
    }

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

    public String getMenuNameFuzzy() {
        return this.menuNameFuzzy;
    }

    public void setMenuNameFuzzy(String menuNameFuzzy) {
        this.menuNameFuzzy = menuNameFuzzy;
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

    public String getMenuUrlFuzzy() {
        return this.menuUrlFuzzy;
    }

    public void setMenuUrlFuzzy(String menuUrlFuzzy) {
        this.menuUrlFuzzy = menuUrlFuzzy;
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

    public String getPermissionCodeFuzzy() {
        return this.permissionCodeFuzzy;
    }

    public void setPermissionCodeFuzzy(String permissionCodeFuzzy) {
        this.permissionCodeFuzzy = permissionCodeFuzzy;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconFuzzy() {
        return this.iconFuzzy;
    }

    public void setIconFuzzy(String iconFuzzy) {
        this.iconFuzzy = iconFuzzy;
    }

}
