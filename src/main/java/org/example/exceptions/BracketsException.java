package org.example.exceptions;

public class BracketsException
        extends RuntimeException {
    public BracketsException(String errorMessage) {
        super(errorMessage);
    }
}