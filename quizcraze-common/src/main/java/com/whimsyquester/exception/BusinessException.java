package com.whimsyquester.exception;

import com.whimsyquester.entity.enums.ResponseCodeEnum;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.exception
 * @ClassName: BusinessException
 * @Datetime: 2023/11/19 23:41
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示业务异常的自定义异常类
 */


public class BusinessException extends RuntimeException {

    private ResponseCodeEnum codeEnum;  // 错误代码枚举

    private Integer code;   // 错误代码

    private String message; // 错误消息

    public BusinessException(String message, Throwable e) {
        super(message, e);
        this.message = message;
    }

    public BusinessException(String message) {
        super(message);
        this.message = message;
    }

    public BusinessException(Throwable e) {
        super(e);
    }

    public BusinessException(ResponseCodeEnum codeEnum) {
        super(codeEnum.getMsg());
        this.codeEnum = codeEnum;
        this.code = codeEnum.getCode();
        this.message = codeEnum.getMsg();
    }

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public ResponseCodeEnum getCodeEnum() {
        return codeEnum;
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    /**
     * 重写fillInStackTrace 业务异常不需要堆栈信息，提高效率.
     */
    @Override
    public Throwable fillInStackTrace() {
        return this;
    }

}

