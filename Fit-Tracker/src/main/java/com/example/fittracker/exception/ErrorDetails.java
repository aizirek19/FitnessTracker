package com.example.fittracker.exception;

import lombok.Data;

@Data
public class ErrorDetails {

    private String errorCode;
    private String errorMessage;

    public ErrorDetails(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}
