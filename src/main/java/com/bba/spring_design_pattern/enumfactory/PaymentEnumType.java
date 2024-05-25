package com.bba.spring_design_pattern.enumfactory;


import com.bba.spring_design_pattern.enumfactory.Impl.CreditCardPayment;
import com.bba.spring_design_pattern.enumfactory.Impl.WireTransferPayment;

public enum PaymentEnumType {
    CREDIT_CARD("creditCard", new CreditCardPayment()),
    WIRE_TRANSFER("wireTransfer", new WireTransferPayment());

    private final String value;


    private final Payment paymentEnum;

    PaymentEnumType(String value, Payment paymentEnum) {
        this.value = value;
        this.paymentEnum = paymentEnum;
    }

    public String getValue() {
        return value;
    }

    public Payment getPaymentEnum() {
        return paymentEnum;
    }


    public static PaymentEnumType getPaymentType(String name) {
        for (PaymentEnumType paymentType : PaymentEnumType.values()) {
            if (paymentType.getValue().equals(name)) {
                return paymentType;
            }
        }
        throw new IllegalArgumentException("payment type not found:"+name);
}
}
