package com.commerce.models.abstracts;

import java.util.UUID;

public abstract class Payment {
    protected UUID id;
    protected Double value;

    public Payment(Double value) {
        this.id = UUID.randomUUID();
        this.value = value;
    }

    public UUID getId() {
        return id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    protected abstract void processPayment();
}
