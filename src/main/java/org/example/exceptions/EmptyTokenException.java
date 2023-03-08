package org.example.exceptions;

public class EmptyTokenException
        extends RuntimeException {
    public EmptyTokenException(String errorMessage) {
        super(errorMessage);
    }
}
