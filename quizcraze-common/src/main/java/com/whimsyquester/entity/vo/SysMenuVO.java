package com.whimsyquester.entity.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.vo
 * @ClassName: SysMenuVO
 * @Datetime: 2023/11/20 04:14
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 菜单表
 */

@SuppressWarnings("serial")
public class SysMenuVO implements Serializable {

    private static final long serialVersionUID = 851203620520311526L;
    /**
     * 菜单名
     */
    private String menuName;
    /**
     * 菜单跳转到的地址
     */
    private String menuUrl;

    private String icon;

    private List<SysMenuVO> children = new ArrayList<>();

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public List<SysMenuVO> getChildren() {
        return children;
    }

    public void setChildren(List<SysMenuVO> children) {
        this.children = children;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}

