package com.whimsyquester.entity.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.whimsyquester.entity.enums.DateTimePatternEnum;
import com.whimsyquester.utils.DateUtil;
import com.whimsyquester.utils.StringTools;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.po
 * @ClassName: AppUpdate
 * @Datetime: 2023/11/20 02:35
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示应用更新的信息
 */


public class AppUpdate implements Serializable {


    /**
     * 自增ID
     */
    private Integer id;

    /**
     * 版本号
     */
    private String version;

    /**
     * 更新描述
     */
    private String updateDesc;

    /**
     * 更新类型0:全更新 1:局部热更新
     */
    private Integer updateType;

    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    /**
     * 0:未发布 1:灰度发布 2:全网发布
     */
    private Integer status;

    /**
     * 灰度设备ID
     */
    private String grayscaleDevice;

    private String[] updateDescArray;

    public String[] getUpdateDescArray() {
        if (!StringTools.isEmpty(updateDesc)) {
            return updateDesc.split("\\|");
        }
        return updateDescArray;
    }

    public void setUpdateDescArray(String[] updateDescArray) {
        this.updateDescArray = updateDescArray;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUpdateDesc() {
        return this.updateDesc;
    }

    public void setUpdateDesc(String updateDesc) {
        this.updateDesc = updateDesc;
    }

    public Integer getUpdateType() {
        return this.updateType;
    }

    public void setUpdateType(Integer updateType) {
        this.updateType = updateType;
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

    public String getGrayscaleDevice() {
        return this.grayscaleDevice;
    }

    public void setGrayscaleDevice(String grayscaleDevice) {
        this.grayscaleDevice = grayscaleDevice;
    }

    @Override
    public String toString() {
        return "自增ID:" + (id == null ? "空" : id) + "，版本号:" + (version == null ? "空" : version) + "，更新描述:" + (updateDesc == null ? "空" : updateDesc) + "，更新类型0:全更新 " +
                "1:局部热更新:" + (updateType == null ? "空" : updateType) + "，创建时间:" + (createTime == null ? "空" : DateUtil.format(createTime,
                DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + "，0:未发布 1:灰度发布 2:全网发布:" + (status == null ? "空" : status) + "，灰度设备ID:" + (grayscaleDevice == null ? "空" : grayscaleDevice);
    }
}

