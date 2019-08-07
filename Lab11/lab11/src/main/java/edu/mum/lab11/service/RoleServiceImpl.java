package edu.mum.lab11.service;

import edu.mum.lab11.domain.Role;
import edu.mum.lab11.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role get(Long id) {
        return roleRepository.findById(id).get();
    }

}
