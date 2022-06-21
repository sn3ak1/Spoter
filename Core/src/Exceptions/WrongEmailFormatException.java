package Exceptions;

import java.lang.Throwable;

public class WrongEmailFormatException extends Exception {
    private Integer errorCode;

    public WrongEmailFormatException(String message, Throwable cause, Integer errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    Integer getErrorCode() {
        return this.errorCode;
    }
}
