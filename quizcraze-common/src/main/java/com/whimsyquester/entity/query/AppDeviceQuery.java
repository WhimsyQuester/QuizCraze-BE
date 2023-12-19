package com.whimsyquester.entity.query;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.query
 * @ClassName: AppDeviceQuery
 * @Datetime: 2023/11/20 02:13
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 用于表示设备信息参数的查询条件
 */

public class AppDeviceQuery extends BaseParam {

    /**
     * 设备ID
     */
    private String deviceId;

    private String deviceIdFuzzy;

    /**
     * 手机品牌
     */
    private String deviceBrand;

    private String deviceBrandFuzzy;

    /**
     * 创建时间
     */
    private String createTime;

    private String createTimeStart;

    private String createTimeEnd;

    /**
     * 最后使用时间
     */
    private String lastUseTime;

    private String lastUseTimeStart;

    private String lastUseTimeEnd;

    /**
     * ip
     */
    private String ip;

    private String ipFuzzy;

    public String getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceIdFuzzy() {
        return this.deviceIdFuzzy;
    }

    public void setDeviceIdFuzzy(String deviceIdFuzzy) {
        this.deviceIdFuzzy = deviceIdFuzzy;
    }

    public String getDeviceBrand() {
        return this.deviceBrand;
    }

    public void setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
    }

    public String getDeviceBrandFuzzy() {
        return this.deviceBrandFuzzy;
    }

    public void setDeviceBrandFuzzy(String deviceBrandFuzzy) {
        this.deviceBrandFuzzy = deviceBrandFuzzy;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateTimeStart() {
        return this.createTimeStart;
    }

    public void setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
    }

    public String getCreateTimeEnd() {
        return this.createTimeEnd;
    }

    public void setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public String getLastUseTime() {
        return this.lastUseTime;
    }

    public void setLastUseTime(String lastUseTime) {
        this.lastUseTime = lastUseTime;
    }

    public String getLastUseTimeStart() {
        return this.lastUseTimeStart;
    }

    public void setLastUseTimeStart(String lastUseTimeStart) {
        this.lastUseTimeStart = lastUseTimeStart;
    }

    public String getLastUseTimeEnd() {
        return this.lastUseTimeEnd;
    }

    public void setLastUseTimeEnd(String lastUseTimeEnd) {
        this.lastUseTimeEnd = lastUseTimeEnd;
    }

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIpFuzzy() {
        return this.ipFuzzy;
    }

    public void setIpFuzzy(String ipFuzzy) {
        this.ipFuzzy = ipFuzzy;
    }

}
