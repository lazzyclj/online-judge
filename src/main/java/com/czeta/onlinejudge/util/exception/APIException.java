package com.czeta.onlinejudge.util.exception;

import com.czeta.onlinejudge.util.enums.IBaseStatusMsg;

public class APIException extends Exception implements IBaseException {
    private Integer code;
    private String message;

    public APIException() {}

    public APIException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public APIException(IBaseStatusMsg statusMsg) {
        this.code = statusMsg.getCode();
        this.message = statusMsg.getMessage();
    }

    public APIException(IBaseStatusMsg statusMsg, String message) {
        this.code = statusMsg.getCode();
        this.message = message == null ? statusMsg.getMessage() : message;
    }

    public APIException(Throwable cause) {
        super(cause);
        this.code = IBaseStatusMsg.APIEnum.SERVER_ERROR.getCode();
        this.message = cause.getMessage() == null ? IBaseStatusMsg.APIEnum.SERVER_ERROR.getMessage() : cause.getMessage();
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
