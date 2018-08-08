package com.snaildev.hellospringboot.service;

import com.snaildev.hellospringboot.domain.User;

import java.util.List;

public interface IUserService {
    List<User> userList();
}
