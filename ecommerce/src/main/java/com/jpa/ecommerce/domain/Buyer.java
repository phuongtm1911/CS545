package com.jpa.ecommerce.domain;

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
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany(mappedBy = "buyer", cascade = CascadeType.ALL)
    private List<Orders> orders;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cart_id")
    private Cart cart;
    @ManyToMany
    @JoinTable(name = "following", joinColumns = {@JoinColumn(name = "buyer_id")}, inverseJoinColumns = {@JoinColumn(name = "seller_id")})
    private List<Seller> sellers;
}