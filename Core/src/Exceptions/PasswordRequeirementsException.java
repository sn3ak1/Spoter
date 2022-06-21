package Exceptions;

import java.lang.Throwable;

public class PasswordRequeirementsException extends Exception {
    private Integer errorCode;

    public PasswordRequeirementsException(String message, Throwable cause, Integer errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    Integer getErrorCode() {
        return this.errorCode;
    }
}
