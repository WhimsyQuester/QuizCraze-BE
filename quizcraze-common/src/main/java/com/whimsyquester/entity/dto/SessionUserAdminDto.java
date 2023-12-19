package com.whimsyquester.entity.dto;

import com.whimsyquester.entity.vo.SysMenuVO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.dto
 * @ClassName: SessionUserAdminDto
 * @Datetime: 2023/11/20 02:06
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 用于在应用程序的不同层之间传输与用户会话和管理员权限相关的数据
 */

public class SessionUserAdminDto implements Serializable {

    private static final long serialVersionUID = 1690149993220674991L;
    private Integer userId; // 用户ID
    private String userName;    // 用户名
    private List<SysMenuVO> menuList;   // 菜单列表
    private List<String> permissionCodeList = new ArrayList<>();    // 权限代码列表
    private Boolean superAdmin; // 是否是超级管理员

    public Boolean getSuperAdmin() {
        return superAdmin;
    }

    public void setSuperAdmin(Boolean superAdmin) {
        this.superAdmin = superAdmin;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<SysMenuVO> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<SysMenuVO> menuList) {
        this.menuList = menuList;
    }

    public List<String> getPermissionCodeList() {
        return permissionCodeList;
    }

    public void setPermissionCodeList(List<String> permissionCodeList) {
        this.permissionCodeList = permissionCodeList;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
