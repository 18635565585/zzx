package com.zzx.entity;


import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@DynamicUpdate
@Data
public class AdmissionTicket {


    /*景区id*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /*景区名称*/
    private String name;

    /*景区地址*/
    private String adress;

    /*景区票价*/
    private BigDecimal price;

    /*景区门票数量*/
    private Integer number;

    /*取票电话*/
    private String phone;

    /*景区简介*/
    private String introduction;

    /*景区图片*/
    private String img;

    /*状态 0下架1上架*/
    private Integer state;

}
