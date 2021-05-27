package com.example.demo.service.impl;

import com.example.demo.DemoResult;
import com.example.demo.model.user.UserDTO;
import com.example.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * date: 2021/1/4
 * author: wangfan
 * description: 用户信息服务
 **/
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Override
    public DemoResult<UserDTO> getUser(Long id) {
        return null;
    }

    @Override
    public DemoResult<List<UserDTO>> queryUser(Long id) {
        return null;
    }

    @Override
    public DemoResult<Boolean> updateUser() {
        return null;
    }

    @Override
    public DemoResult<Boolean> deleteUser(Long id) {
        return null;
    }
}
