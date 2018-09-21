package com.zzx.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class User {

    /*用户id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    /*用户姓名*/
    private String name;

    /*用户头像*/
    private String img;

    /*创建时间*/
    private Date date;
}
