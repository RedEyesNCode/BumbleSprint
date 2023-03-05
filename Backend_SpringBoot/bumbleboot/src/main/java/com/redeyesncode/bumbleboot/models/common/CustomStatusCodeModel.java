package com.redeyesncode.bumbleboot.models.common;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomStatusCodeModel {
    private String status;
    private int code;

    private Object data;
    private String message;

    public CustomStatusCodeModel(String status, int code, String message, Object data) {
        super();
        this.data = data;
        this.code = code;
        this.status = status;
        this.message = message;
    }

    public CustomStatusCodeModel(String status, int code, Object data) {
        super();
        this.data = data;
        this.code = code;
        this.status = status;
        this.message = "message";
    }

}
