package com.phoenix.ecommerce.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
public class Seller implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String phone;
    @OneToOne
    private Address address;
    @OneToOne
    private User user;
    @OneToMany
    private List<Product> products;
}