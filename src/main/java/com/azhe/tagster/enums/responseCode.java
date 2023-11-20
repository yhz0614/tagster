package com.azhe.tagster.enums;

public enum responseCode {
    SUCCESS(200, "成功"),
    ERROR(500, "服务器内部错误"),
    NOT_FOUND(404, "资源未找到"),
    UNAUTHORIZED(401, "未授权");

    private final int code;
    private final String message;

    responseCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

