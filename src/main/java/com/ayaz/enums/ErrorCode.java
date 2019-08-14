package com.ayaz.enums;

public enum ErrorCode {

    TASK_NOT_FOUND(100),
    PARENT_NOT_FOUND(200),
    NUMBER_FORMAT_EXCEPTION(500),
    VALIDATION_ERROR(101);

    private int code;

    private ErrorCode(int code){
        this.code=code;
    }

    public int getCode() {
        return code;
    }

}

