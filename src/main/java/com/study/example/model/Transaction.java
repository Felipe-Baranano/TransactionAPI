package com.study.example.model;

import java.time.OffsetDateTime;

public class Transaction {

    private final  double value;
    private final  OffsetDateTime timestamp;

    public Transaction(final double value, final OffsetDateTime timestamp) {
        this.value = value;
        this.timestamp = timestamp;
    }

    public double getValue() {
        return value;
    }

    public OffsetDateTime getTimestamp() {
        return timestamp;
    }   
}
