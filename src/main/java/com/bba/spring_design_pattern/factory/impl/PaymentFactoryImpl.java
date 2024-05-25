package com.bba.spring_design_pattern.factory.impl;

import com.bba.spring_design_pattern.dto.PaymentRequest;
import com.bba.spring_design_pattern.factory.PaymentFactory;
import com.bba.spring_design_pattern.strategy.PaymentStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class PaymentFactoryImpl implements PaymentFactory {

    private final Map<String, PaymentStrategy> paymentStrategyMap;

    public PaymentStrategy getPaymentStrategy(String paymentType){
        PaymentStrategy paymentStrategy=paymentStrategyMap.get(paymentType);
        if(paymentStrategy==null){
            throw new IllegalArgumentException("Invalid payment type: "+paymentType);
        }
        return paymentStrategy;
    }

    @Override
    public String executePayment(PaymentRequest paymentRequest) {
        PaymentStrategy paymentStrategy=getPaymentStrategy(paymentRequest.paymentType());
        if(paymentRequest.paymentType().equals("Credit card")){

        }
                return paymentStrategy.pay(paymentRequest.orderId(),paymentRequest.amount(),paymentRequest.paymentType());
    }
}
