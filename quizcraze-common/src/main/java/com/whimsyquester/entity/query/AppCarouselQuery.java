package com.whimsyquester.entity.query;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.query
 * @ClassName: AppCarouselQuery
 * @Datetime: 2023/11/20 02:12
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 用于表示 app 轮播参数的查询条件
 */

public class AppCarouselQuery extends BaseParam {

    /**
     * 自增ID
     */
    private Integer carouselId;

    /**
     * 图片
     */
    private String imgPath;

    private String imgPathFuzzy;

    /**
     * 0:分享1:问题 2:考题 3:外部连接
     */
    private Integer objectType;

    /**
     * 文章ID
     */
    private String objectId;

    private String objectIdFuzzy;

    /**
     * 外部连接
     */
    private String outerLink;

    private String outerLinkFuzzy;

    /**
     * 排序
     */
    private Integer sort;

    public Integer getCarouselId() {
        return this.carouselId;
    }

    public void setCarouselId(Integer carouselId) {
        this.carouselId = carouselId;
    }

    public String getImgPath() {
        return this.imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getImgPathFuzzy() {
        return this.imgPathFuzzy;
    }

    public void setImgPathFuzzy(String imgPathFuzzy) {
        this.imgPathFuzzy = imgPathFuzzy;
    }

    public Integer getObjectType() {
        return this.objectType;
    }

    public void setObjectType(Integer objectType) {
        this.objectType = objectType;
    }

    public String getObjectId() {
        return this.objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getObjectIdFuzzy() {
        return this.objectIdFuzzy;
    }

    public void setObjectIdFuzzy(String objectIdFuzzy) {
        this.objectIdFuzzy = objectIdFuzzy;
    }

    public String getOuterLink() {
        return this.outerLink;
    }

    public void setOuterLink(String outerLink) {
        this.outerLink = outerLink;
    }

    public String getOuterLinkFuzzy() {
        return this.outerLinkFuzzy;
    }

    public void setOuterLinkFuzzy(String outerLinkFuzzy) {
        this.outerLinkFuzzy = outerLinkFuzzy;
    }

    public Integer getSort() {
        return this.sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

}
