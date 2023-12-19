package com.whimsyquester.entity.query;

import java.util.List;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.query
 * @ClassName: AppUserCollectQuery
 * @Datetime: 2023/11/20 02:36
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 用于表示用户收藏参数的查询条件
 */

public class AppUserCollectQuery extends BaseParam {

    /**
     * 收藏ID
     */
    private Integer collectId;

    /**
     * 用户ID
     */
    private String userId;

    private String userIdFuzzy;

    /**
     * 主体ID 问题ID,考题ID,分享文章ID
     */
    private String objectId;

    private String objectIdFuzzy;

    /**
     * 0:分享收藏 1:问题收藏  2:考题收藏
     */
    private Integer collectType;

    /**
     * 收藏时间
     */
    private String collectTime;

    private String collectTimeStart;

    private String collectTimeEnd;

    private List<String> objectIdList;

    public List<String> getObjectIdList() {
        return objectIdList;
    }

    public void setObjectIdList(List<String> objectIdList) {
        this.objectIdList = objectIdList;
    }

    public Integer getCollectId() {
        return this.collectId;
    }

    public void setCollectId(Integer collectId) {
        this.collectId = collectId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserIdFuzzy() {
        return this.userIdFuzzy;
    }

    public void setUserIdFuzzy(String userIdFuzzy) {
        this.userIdFuzzy = userIdFuzzy;
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

    public Integer getCollectType() {
        return this.collectType;
    }

    public void setCollectType(Integer collectType) {
        this.collectType = collectType;
    }

    public String getCollectTime() {
        return this.collectTime;
    }

    public void setCollectTime(String collectTime) {
        this.collectTime = collectTime;
    }

    public String getCollectTimeStart() {
        return this.collectTimeStart;
    }

    public void setCollectTimeStart(String collectTimeStart) {
        this.collectTimeStart = collectTimeStart;
    }

    public String getCollectTimeEnd() {
        return this.collectTimeEnd;
    }

    public void setCollectTimeEnd(String collectTimeEnd) {
        this.collectTimeEnd = collectTimeEnd;
    }

}
