package com.phoenix.ecommerce.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Entity
public class Category {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable=false, unique=true)
    @NotBlank
    private String name;
    @Column(length=1024)
    private String description;
    private boolean disabled;
    @OneToMany(mappedBy="category", cascade = CascadeType.ALL)
    private List<Product> products;
}
