package com.whimsyquester.entity.enums;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.enums
 * @ClassName: ResponseCodeEnum
 * @Datetime: 2023/11/20 04:08
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示响应状态码和对应的消息
 */

public enum ResponseCodeEnum {
    CODE_200(200, "请求成功"),
    CODE_404(404, "请求地址不存在"),
    CODE_600(600, "请求参数错误"),
    CODE_601(601, "信息已经存在"),
    CODE_500(500, "服务器返回错误，请联系管理员"),
    CODE_901(901, "登录超时"),
    CODE_902(902, "权限不足"),
    CODE_903(903, "请求太频繁");

    private final Integer code;

    private final String msg;

    ResponseCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}

