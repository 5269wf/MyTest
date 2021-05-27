package com.example.demo.service;

import com.example.demo.DemoResult;
import com.example.demo.model.user.UserDTO;

import java.util.List;

/**
 * date: 2021-01-04
 * author: wangfan
 * description: 用户信息服务
 **/
public interface UserService {

    DemoResult<UserDTO> getUser(Long id);

    DemoResult<List<UserDTO>> queryUser(Long id);

    DemoResult<Boolean> updateUser();

    DemoResult<Boolean> deleteUser(Long id);
}
