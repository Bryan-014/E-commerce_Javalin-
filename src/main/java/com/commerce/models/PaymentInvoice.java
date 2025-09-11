package com.commerce.models;

import com.commerce.models.abstracts.Payment;

public class PaymentInvoice extends Payment {
    public PaymentInvoice(Double value) {
        super(value);
    }

    @Override
    protected final void processPayment() {

    }
}