package com.phoenix.ecommerce.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Buyer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    private Integer point;
    @OneToOne
    private Address address;
    @OneToOne
    private User user;
    @OneToMany
    private List<Order> orders;
    @OneToOne
    private Cart cart;
}