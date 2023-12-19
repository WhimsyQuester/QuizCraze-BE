package com.whimsyquester.entity.dto;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.dto
 * @ClassName: AppUserLoginDto
 * @Datetime: 2023/11/20 02:03
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 用于在应用程序的不同层之间传输用户登录相关的数据
 */

public class AppUserLoginDto {
    private String userId;  // 用户ID
    private String nickName;    // 用户昵称

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}

