package com.snaildev.hellospringboot.service.impl;

import com.snaildev.hellospringboot.domain.User;
import com.snaildev.hellospringboot.repository.UserRepository;
import com.snaildev.hellospringboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> userList() {
        return  userRepository.findAll();
    }
}
