package com.projetospringboot.course.services.exceptions;

import java.io.Serial;

public class ResourceNotFoundException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 5922804075104234121L;

    public ResourceNotFoundException(Object id){
        super("Resource not found. Id " + id);
    }
}
