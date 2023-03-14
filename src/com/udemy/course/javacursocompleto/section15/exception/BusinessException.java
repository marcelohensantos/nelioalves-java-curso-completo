package com.udemy.course.javacursocompleto.section15.exception;

import java.io.IOException;

public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }
}
