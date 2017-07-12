package com.omm.finder.exception;

/**
 * Created by li on 2017/7/12.
 */
public class BusinessException extends Exception {
    private static final long serialVersionUID = 8724252889850188629L;


    private String code;

    public BusinessException(String code) {
        super();
        this.code = code;
    }

    public BusinessException(String code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(String code, Throwable cause) {
        super(cause);
        this.code = code;
    }

    public BusinessException(String errorCode, String message, Throwable cause) {
        super(message, cause);
        this.code = errorCode;
    }

    public String getCode() {
        return code;
    }
}
