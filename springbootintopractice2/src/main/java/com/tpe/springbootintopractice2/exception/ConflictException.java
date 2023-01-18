package com.tpe.springbootintopractice2.exception;

public class ConflictException extends RuntimeException{


    public ConflictException() {
    }

    public ConflictException(String message) {
        super(message);
    }
}
