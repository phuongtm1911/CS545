package com.jpa.ecommerce.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Orders implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<OrderItem> orderItems;
    private BigDecimal totalPrice;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="buyer_id")
    private Buyer buyer;
    @OneToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="shippingAddress_id")
    private Address shippingAddress;
    @OneToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="billingAddress_id")
    private Address billingAddress;
    @OneToOne(cascade=CascadeType.PERSIST)
    @JoinColumn(name="payment_id")
    private Payment payment;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
    private Date createdDate = new Date();
    private Date endDate = new Date();

}
