package com.lzy.shan.restaurant.exception;

import com.lzy.shan.restaurant.Enums.ResultEnum;
import org.apache.shiro.authc.AuthenticationException;

public class CustomAuthenticationException extends AuthenticationException {
    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public CustomAuthenticationException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
