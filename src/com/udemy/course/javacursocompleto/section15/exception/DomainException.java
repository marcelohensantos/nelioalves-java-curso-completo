package com.udemy.course.javacursocompleto.section15.exception;

import java.io.IOException;

public class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }
}
