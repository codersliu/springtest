package com.sliu.springtest.controller;

import com.sliu.springtest.service.AsynService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageName:com.sliu.springtest.controller
 * @ClassName:AsynController
 * @Description:
 * @author:sliu
 * @data 2022/5/1 9:38
 */

@RestController
public class AsynController {

    @Autowired
    AsynService asynService;

    @RequestMapping("/hello")
    public String hello(){
        asynService.hello();
        return "OK!";
    }
}
