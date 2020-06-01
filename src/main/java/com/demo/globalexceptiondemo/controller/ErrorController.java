package com.demo.globalexceptiondemo.controller;

import com.demo.globalexceptiondemo.base.BusinessException;
import com.demo.globalexceptiondemo.dto.ResultCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ErrorController
 * @Description: TODO
 * @Author Administrator
 * @Date 2020/6/1 0001
 **/
@RestController
public class ErrorController {


    @GetMapping("/hello")
    public String hello(){
        return "hello laowan!";
    }

    @GetMapping("/testGet")
    public String testGet(String name) throws Exception {
        if (name==null) {
            throw new BusinessException(ResultCode.PAPAM_IS_BLANK);
        }
        return "laowan!";
    }

    @PostMapping("/testPost")
    public String testPost(){
        return "post laowan!";
    }

}
