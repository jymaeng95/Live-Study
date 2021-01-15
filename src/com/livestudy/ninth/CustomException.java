package com.livestudy.ninth;

public class CustomException extends Exception {
    private final int ERR_CODE;

    public CustomException(String message) {
        this(message,200);
    }

    public CustomException(String message, int ERR_CODE) {
        super(message);
        this.ERR_CODE = ERR_CODE;
    }

    public int getErrorCode() {
        return ERR_CODE;
    }
}
