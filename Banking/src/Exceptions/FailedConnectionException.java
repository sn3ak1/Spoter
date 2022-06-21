package Exceptions;

import java.lang.Throwable;

public class FailedConnectionException extends Exception {
    private Integer errorCode;

    public FailedConnectionException(String message, Throwable cause, Integer errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    Integer getErrorCode() {
        return this.errorCode;
    }
}
