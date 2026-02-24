package com.study.example.dto;

import jakarta.validation.constraints.NotNull;

public class TransactionDTO {

    @NotNull
    private double value;

    @NotNull
    private String timestamp;

    public double getValue() {
        return value;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
