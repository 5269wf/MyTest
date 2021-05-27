package com.example.demo.dal.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 用户表
 */
@Entity
@Table(name = "user")
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 创建时间
     */
    @Column(name = "gmt_create")
    private LocalDateTime gmtCreate;

    /**
     * 修改时间
     */
    @Column(name = "gmt_modified")
    private LocalDateTime gmtModified;

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     * 用户名称
     */
    @Column(name = "name")
    private String name;

    /**
     * 1表示正常, 0表示删除
     */
    @Column(name = "status", nullable = false)
    private Integer status;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private String userId;

}
