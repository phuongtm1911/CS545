package com.phoenix.ecommerce.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Cart {
    @Id
    @GeneratedValue
    private Long id;
    @OneToMany
    private List<Item> items;
}
