package com.phoenix.ecommerce.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    @Column(nullable=false)
    private String name;
    private String description;
    @Column(nullable=false)
    private BigDecimal price = new BigDecimal("0.0");
    private String imageUrl;
    private boolean disabled;
    private Date createdTime = new Date();
    private Integer availableQuantity;
    private Integer soldQuantity;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "seller_id")
    private Seller seller;
    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name="category_id")
    private Category category;


}
