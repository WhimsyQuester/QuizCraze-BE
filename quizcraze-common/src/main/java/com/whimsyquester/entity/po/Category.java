package com.whimsyquester.entity.po;

import com.whimsyquester.annotation.VerifyParam;

import java.io.Serializable;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.po
 * @ClassName: Category
 * @Datetime: 2023/11/20 02:38
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示分类信息
 */

public class Category implements Serializable {


    /**
     * 分类ID
     */
    private Integer categoryId;

    /**
     * 名称
     */
    @VerifyParam(required = true)
    private String categoryName;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 图标
     */
    private String iconPath;

    /**
     * 背景颜色
     */
    private String bgColor;

    /**
     * 0:问题分类 1:考题分类 2:问题分类和考题分类
     */
    @VerifyParam(required = true)
    private Integer type;

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

    public String getBgColor() {
        return this.bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public Integer getType() {
        return this.type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "分类ID:" + (categoryId == null ? "空" : categoryId) + "，名称:" + (categoryName == null ? "空" : categoryName) + "，排序:" + (sort == null ? "空" : sort) + "，图标:" + (iconPath == null ? "空" : iconPath) + "，背景颜色:" + (bgColor == null ? "空" : bgColor) + "，0:问题分类 1:考题分类 2:问题分类和考题分类:" + (type == null ? "空" : type);
    }
}

