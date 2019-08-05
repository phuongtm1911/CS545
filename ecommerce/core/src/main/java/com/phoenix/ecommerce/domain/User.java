package com.phoenix.ecommerce.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable=false, unique=true)
    @NotBlank
    private String username;
    @Column(nullable=false, unique=true)
    @NotBlank
    @Email(message="{errors.invalid_email}")
    private String email;
    @Column(nullable=false)
    @NotBlank
    @Size(min=4)
    private String password;
    private String passwordResetToken;
    @Enumerated(EnumType.STRING)
    private Role role;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
