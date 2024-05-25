package com.bba.spring_design_pattern.enumfactory.Impl;

import com.bba.spring_design_pattern.enumfactory.Payment;
import org.springframework.stereotype.Service;

@Service
public class CreditCardPayment implements Payment {

    @Override
    public String pay(String orderId, Double amount) {
        return "Payment done using Credit card in EnumType method";
    }
}
