package com.bba.spring_design_pattern.controller;

import com.bba.spring_design_pattern.dto.PaymentRequest;
import com.bba.spring_design_pattern.factory.PaymentFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/payment")
@RequiredArgsConstructor
public class PaymentController {

private final PaymentFactory paymentFactory;

@PostMapping
public ResponseEntity<String> payment(@RequestBody PaymentRequest paymentRequest){
    return ResponseEntity.ok(paymentFactory.executePayment(paymentRequest));
}

}
