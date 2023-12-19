package com.whimsyquester.entity.query;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.query
 * @ClassName: SysAccountQuery
 * @Datetime: 2023/11/20 02:49
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 用于表示账号信息参数的查询条件
 */

public class SysAccountQuery extends BaseParam {

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 手机号
     */
    private String phone;

    private String phoneFuzzy;

    /**
     * 用户名
     */
    private String userName;

    private String userNameFuzzy;

    /**
     * 密码
     */
    private String password;

    private String passwordFuzzy;

    /**
     * 职位
     */
    private String position;

    private String positionFuzzy;

    /**
     * 状态 0:禁用 1:启用
     */
    private Integer status;

    /**
     * 用户拥有的角色多个用逗号隔开
     */
    private String roles;

    private String rolesFuzzy;

    /**
     * 创建时间
     */
    private String createTime;

    private String createTimeStart;

    private String createTimeEnd;

    private Boolean queryRoles;

    public Boolean getQueryRoles() {
        return queryRoles;
    }

    public void setQueryRoles(Boolean queryRoles) {
        this.queryRoles = queryRoles;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoneFuzzy() {
        return this.phoneFuzzy;
    }

    public void setPhoneFuzzy(String phoneFuzzy) {
        this.phoneFuzzy = phoneFuzzy;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNameFuzzy() {
        return this.userNameFuzzy;
    }

    public void setUserNameFuzzy(String userNameFuzzy) {
        this.userNameFuzzy = userNameFuzzy;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordFuzzy() {
        return this.passwordFuzzy;
    }

    public void setPasswordFuzzy(String passwordFuzzy) {
        this.passwordFuzzy = passwordFuzzy;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPositionFuzzy() {
        return this.positionFuzzy;
    }

    public void setPositionFuzzy(String positionFuzzy) {
        this.positionFuzzy = positionFuzzy;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRoles() {
        return this.roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public String getRolesFuzzy() {
        return this.rolesFuzzy;
    }

    public void setRolesFuzzy(String rolesFuzzy) {
        this.rolesFuzzy = rolesFuzzy;
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

}
