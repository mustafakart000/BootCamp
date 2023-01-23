package com.tpe.SpringBoot_queryAndUpdate.exception;

public class ConflictException extends RuntimeException {
    public ConflictException(String message) {
        super(message);
    }
}
