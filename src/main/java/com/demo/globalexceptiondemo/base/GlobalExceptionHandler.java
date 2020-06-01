package com.demo.globalexceptiondemo.base;

import com.demo.globalexceptiondemo.dto.CommonResp;
import com.sun.xml.internal.bind.v2.TODO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/** 异常处理
 * @ClassName GlobalExceptionHandler
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/6/1 0001
 *
 * 1、使用@ControllerAdvice注解声明全局异常处理类
 * 2、使用@ExceptionHandler指定要捕捉什么异常，这里会优先捕捉子级异常，当没有匹配到子级异常时，才会去匹配父级异常。
 *    比如同时声明了@ExceptionHandler( BusinessException.class )和@ExceptionHandler(Exception.class )方法进行异常处理，当
 *    抛出BusinessException异常时，只会被@ExceptionHandler( BusinessException.class )注解的方法捕获到。
 * 3、通过@ResponseBody注解控制返回json格式数据。
 **/
@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 业务异常处理
     * @MethodName:
     * @Description: TODO
     * @Param:
     * @Return:
     * @Author: Administrator
     * @Date: 2020/6/1 0001
    **/
    @ResponseBody
    @ExceptionHandler(BusinessException.class)
    public CommonResp handleBusinessException(BusinessException e) throws Exception{
        log.error("BusinessException error ",e);
        return CommonResp.create(e.getResultCode());
    }

}
