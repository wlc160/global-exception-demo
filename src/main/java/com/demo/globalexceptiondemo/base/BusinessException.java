package com.demo.globalexceptiondemo.base;

import com.demo.globalexceptiondemo.dto.ResultCode;
import lombok.Getter;

/**
 * @ClassName BusinessException
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/6/1 0001
 **/
@Getter
public class BusinessException extends Exception {

    private ResultCode resultCode;

    public BusinessException(){}

    public BusinessException(ResultCode resultCode){
        super(resultCode.getMessage());
        this.resultCode = resultCode;
    }

    public BusinessException(String message){
        super(message);
    }


}
