package com.baitu.testretrofit.network.response;

/**
 * Created by yxs on 2018/2/28.
 * 返回结果封装
 */

public class Response<T> {

    private int code; // 返回的code
    private T result; // 具体的数据结果
    private String msg; // message 可用来返回接口的说明

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return result;
    }

    public void setData(T data) {
        this.result = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
