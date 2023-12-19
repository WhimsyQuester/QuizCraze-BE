package com.whimsyquester.entity.dto;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.dto
 * @ClassName: SessionUserAppDto
 * @Datetime: 2023/11/20 02:06
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 用于在应用程序的不同层之间传输与用户会话和应用程序相关的数据
 */

public class SessionUserAppDto {
    private String userId; // 用户ID
    private String nickName; // 用户昵称
    private String sessionId; // 会话ID

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

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

