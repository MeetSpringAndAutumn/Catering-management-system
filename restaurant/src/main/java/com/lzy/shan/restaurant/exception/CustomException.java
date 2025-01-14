package com.lzy.shan.restaurant.exception;

import com.lzy.shan.restaurant.Enums.ResultEnum;

public class CustomException extends RuntimeException{
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public CustomException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
