package com.whimsyquester.entity.query;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.query
 * @ClassName: CategoryQuery
 * @Datetime: 2023/11/20 02:38
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 用于表示分类参数的查询条件
 */


public class CategoryQuery extends BaseParam {

    /**
     * 分类ID
     */
    private Integer categoryId;

    /**
     * 名称
     */
    private String categoryName;

    private String categoryNameFuzzy;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 图标
     */
    private String iconPath;

    private String iconPathFuzzy;

    /**
     * 背景颜色
     */
    private String bgColor;

    private String bgColorFuzzy;

    /**
     * 0:问题分类 1:考题分类 2:问题分类和考题分类
     */
    private Integer type;

    private Integer[] types;

    public Integer[] getTypes() {
        return types;
    }

    public void setTypes(Integer[] types) {
        this.types = types;
    }

    public Integer getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryNameFuzzy() {
        return this.categoryNameFuzzy;
    }

    public void setCategoryNameFuzzy(String categoryNameFuzzy) {
        this.categoryNameFuzzy = categoryNameFuzzy;
    }

    public Integer getSort() {
        return this.sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIconPath() {
        return this.iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }

    public String getIconPathFuzzy() {
        return this.iconPathFuzzy;
    }

    public void setIconPathFuzzy(String iconPathFuzzy) {
        this.iconPathFuzzy = iconPathFuzzy;
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public String getBgColorFuzzy() {
        return this.bgColorFuzzy;
    }

    public void setBgColorFuzzy(String bgColorFuzzy) {
        this.bgColorFuzzy = bgColorFuzzy;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}
