package edu.mum.lab11.service;

import edu.mum.lab11.domain.User;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername(String username);

    User findUserByEmail(String email);
}
