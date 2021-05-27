package com.example.demo.model.user;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * date: 2021/1/4
 * author: wangfan
 * description: 用户类
 **/
@Data
@Accessors(chain = true)
public class UserDTO implements Serializable {
    /**
     * id
     */
    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 用户id
     */
    private String userId;
}
