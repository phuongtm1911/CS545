package edu.mum.lab11.service;

import edu.mum.lab11.domain.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAll();

    Role get(Long id);
}
