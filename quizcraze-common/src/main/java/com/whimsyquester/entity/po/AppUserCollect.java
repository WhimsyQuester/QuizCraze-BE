package com.whimsyquester.entity.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.whimsyquester.entity.enums.DateTimePatternEnum;
import com.whimsyquester.utils.DateUtil;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;


/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.po
 * @ClassName: AppUserCollect
 * @Datetime: 2023/11/20 02:36
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示用户收藏的信息
 */

public class AppUserCollect implements Serializable {


    /**
     * 收藏ID
     */
    private Integer collectId;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 主体ID 问题ID,考题ID,分享文章ID
     */
    private String objectId;

    /**
     * 0:分享收藏 1:问题收藏  2:考题收藏
     */
    private Integer collectType;

    /**
     * 收藏时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date collectTime;

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

    public String getObjectId() {
        return this.objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public Integer getCollectType() {
        return this.collectType;
    }

    public void setCollectType(Integer collectType) {
        this.collectType = collectType;
    }

    public Date getCollectTime() {
        return this.collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    @Override
    public String toString() {
        return "收藏ID:" + (collectId == null ? "空" : collectId) + "，用户ID:" + (userId == null ? "空" : userId) + "，主体ID 问题ID,考题ID,分享文章ID:" + (objectId == null ? "空" : objectId) + "，0:分享收藏 1:问题收藏  2:考题收藏:" + (collectType == null ? "空" : collectType) + "，收藏时间:" + (collectTime == null ? "空" : DateUtil.format(collectTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()));
    }
}

