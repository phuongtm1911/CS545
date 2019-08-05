package com.phoenix.ecommerce.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    private String cardNumber;
    private String cvv;
    private BigDecimal amount;
    @Enumerated(EnumType.STRING)
    private PaymentMethod method;
}
