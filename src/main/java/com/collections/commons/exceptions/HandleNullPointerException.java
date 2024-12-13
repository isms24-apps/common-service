package com.collections.commons.exceptions;

/**
 * Custom runtime exception to handle specific cases of null pointer issues.
 */
public class HandleNullPointerException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new HandleNullPointerException with the specified detail message.
     *
     * @param message the detail message.
     */
    public HandleNullPointerException(String message) {
        super(message);
    }

    /**
     * Constructs a new HandleNullPointerException with the specified detail message and cause.
     *
     * @param message the detail message.
     * @param cause the cause of the exception.
     */
    public HandleNullPointerException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new HandleNullPointerException with the specified cause.
     *
     * @param cause the cause of the exception.
     */
    public HandleNullPointerException(Throwable cause) {
        super(cause);
    }
}
