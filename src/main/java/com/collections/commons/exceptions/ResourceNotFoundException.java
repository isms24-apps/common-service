package com.collections.commons.exceptions;


public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

   
    public ResourceNotFoundException(String resourceName, String fieldName, Long fieldValue) {
        super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue));
    }

   
    public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
        super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue));
    }

   
    public ResourceNotFoundException(String resourceName, String fieldName) {
        super(String.format("%s not found with %s", resourceName, fieldName));
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
