package com.whimsyquester.entity.vo;

/**
 * @Project: QuizCraze-BE
 * @Package: com.whimsyquester.entity.vo
 * @ClassName: ResponseVO
 * @Datetime: 2023/11/20 04:12
 * @Author: HuangRongQuan
 * @Email: rongquanhuang01@gmail.com
 * @Description: 表示响应数据
 */

public class ResponseVO<T> {
    private String status;
    private Integer code;
    private String info;
    private T data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

