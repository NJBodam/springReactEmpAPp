package com.example.reactspringboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    private final static Long serialVersionUID = 1L;

    public ResourceNotFoundException (String messgae) {
        super(messgae);
    }
}
