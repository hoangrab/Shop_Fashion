package com.shop.service;

import com.shop.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    Optional<User> findById(Long id);
    List<User> findAll();
}
