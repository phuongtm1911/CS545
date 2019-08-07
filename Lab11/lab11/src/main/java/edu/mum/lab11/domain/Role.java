package edu.mum.lab11.domain;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
public class Role {
    @Id
    @GeneratedValue
    private Long id;
    private String role;
}
