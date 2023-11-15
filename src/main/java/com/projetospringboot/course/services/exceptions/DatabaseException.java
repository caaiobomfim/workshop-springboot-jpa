package com.projetospringboot.course.services.exceptions;

import java.io.Serial;

public class DatabaseException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = -1647049948545072609L;

    public DatabaseException(String msg){
        super(msg);
    }
}
