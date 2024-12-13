package com.collections.commons.exceptions;

/**
 * Custom exception to indicate that a resource already exists.
 */
public class ResourceAlreadyExistsException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Constructs a new ResourceAlreadyExistsException with the specified detail message.
     *
     * @param message the detail message.
     */
    public ResourceAlreadyExistsException(String message) {
        super(message);
    }

    /**
     * Constructs a new ResourceAlreadyExistsException with the specified detail message and cause.
     *
     * @param message the detail message.
     * @param cause the cause of the exception.
     */
    public ResourceAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new ResourceAlreadyExistsException with the specified cause.
     *
     * @param cause the cause of the exception.
     */
    public ResourceAlreadyExistsException(Throwable cause) {
        super(cause);
    }
}
