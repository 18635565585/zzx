package com.zzx.enums;

import lombok.Getter;

@Getter
public enum  ProductStatusEnum {

    UP(0,"下架"),
    DOWN(1,"上架");

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }
}
