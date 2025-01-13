package com.max.exception01.exception;

public class IllegalNameException extends Exception{
    public IllegalNameException() {
    }

    public IllegalNameException(String message) {
        super(message);
    }
}
