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
 * @ClassName: ShareInfo
 * @Datetime: 2023/11/20 02:48
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示一篇分享的信息
 */

public class ShareInfo implements Serializable {


    /**
     * 自增ID
     */
    private Integer shareId;

    /**
     * 标题
     */
    private String title;

    /**
     * 0:无封面 1:横幅  2:小图标
     */
    private Integer coverType;

    /**
     * 封面路径
     */
    private String coverPath;

    /**
     * 内容
     */
    private String content;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 0:未发布 1:已发布
     */
    private Integer status;

    /**
     * 用户ID
     */
    private String createUserId;

    /**
     * 姓名
     */
    private String createUserName;

    /**
     * 阅读数量
     */
    private Integer readCount;

    /**
     * 收藏数
     */
    private Integer collectCount;

    /**
     * 0:内部 1:外部投稿
     */
    private Integer postUserType;

    private Boolean haveCollect;

    private Integer collectId;

    public Integer getShareId() {
        return this.shareId;
    }

    public void setShareId(Integer shareId) {
        this.shareId = shareId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCoverType() {
        return this.coverType;
    }

    public void setCoverType(Integer coverType) {
        this.coverType = coverType;
    }

    public String getCoverPath() {
        return this.coverPath;
    }

    public void setCoverPath(String coverPath) {
        this.coverPath = coverPath;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateUserId() {
        return this.createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUserName() {
        return this.createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public Integer getReadCount() {
        return this.readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    public Integer getCollectCount() {
        return this.collectCount;
    }

    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
    }

    public Integer getPostUserType() {
        return this.postUserType;
    }

    public void setPostUserType(Integer postUserType) {
        this.postUserType = postUserType;
    }

    public Boolean getHaveCollect() {
        return haveCollect;
    }

    public void setHaveCollect(Boolean haveCollect) {
        this.haveCollect = haveCollect;
    }

    public Integer getCollectId() {
        return collectId;
    }

    public void setCollectId(Integer collectId) {
        this.collectId = collectId;
    }

    @Override
    public String toString() {
        return "自增ID:" + (shareId == null ? "空" : shareId) + "，标题:" + (title == null ? "空" : title) + "，0:无封面 1:横幅  2:小图标:" + (coverType == null ? "空" : coverType) + "，封面路径:" + (coverPath == null ? "空" : coverPath) + "，内容:" + (content == null ? "空" : content) + "，创建时间:" + (createTime == null ? "空" : DateUtil.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "，0:未发布 1:已发布:" + (status == null ? "空" : status) + "，用户ID:" + (createUserId == null ? "空" : createUserId) + "，姓名:" + (createUserName == null ? "空" : createUserName) + "，阅读数量:" + (readCount == null ? "空" : readCount) + "，收藏数:" + (collectCount == null ? "空" : collectCount) + "，0:内部 1:外部投稿:" + (postUserType == null ? "空" : postUserType);
    }
}

