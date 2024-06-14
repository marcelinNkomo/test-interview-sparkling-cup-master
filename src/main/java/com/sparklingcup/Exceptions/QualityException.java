package com.sparklingcup.Exceptions;

public class QualityException extends Exception {
    public QualityException() {
        super("Quality should be between 0 and 50");
    }
}
