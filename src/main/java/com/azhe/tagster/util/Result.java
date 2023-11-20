package com.azhe.tagster.util;
import java.io.Serializable;
/**
 * @author: azhe
 * @description: 统一响应码
 * @date: 2023/11/20 20:37
 */





public class Result<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 成功
     */
    public static final int SUCCESS = 200;
    /**
     * 失败
     */
    public static final int FAIL = 500;
    private int code;
    private String msg;
    private T data;
    public static <T> Result<T> ok() {
        return restResult(null, SUCCESS, null);
    }
    public static <T> Result<T> ok(String msg) {
        return restResult(null, SUCCESS, msg);
    }
    public static <T> Result<T> ok( String msg,T data) {
        return restResult(data, SUCCESS, msg);
    }
    public static <T> Result<T> fail() {
        return restResult(null, FAIL, null);
    }
    public static <T> Result<T> fail(String msg) {
        return restResult(null, FAIL, msg);
    }
    public static <T> Result<T> fail(T data) {
        return restResult(data, FAIL, null);
    }
    public static <T> Result<T> fail(T data, String msg) {
        return restResult(data, FAIL, msg);
    }
    public static <T> Result<T> fail(int code, String msg) {
        return restResult(null, code, msg);
    }
    private static <T> Result<T> restResult(T data, int code, String msg) {
        Result<T> apiResult = new Result<>();
        apiResult.setCode(code);
        apiResult.setData(data);
        apiResult.setMsg(msg);
        return apiResult;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}

