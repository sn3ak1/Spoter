package Exceptions;

import java.lang.Throwable;

public class RegisterException extends Exception {
    private Integer errorCode;

    public RegisterException(String message, Throwable cause, Integer errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    Integer getErrorCode() {
        return this.errorCode;
    }
}
