package com.example.demo.dal.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@Table(name = "employee")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "d_id")
    private Integer dId;

    @Column(name = "email")
    private String email;

    @Column(name = "gender")
    private Integer gender;

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "last_name")
    private String lastName;

}
