package com.commerce.models;

import com.commerce.models.abstracts.Payment;

public class PaymentCard extends Payment {
    public PaymentCard(Double value) {
        super(value);
    }

    @Override
    protected final void processPayment() {

    }
}
