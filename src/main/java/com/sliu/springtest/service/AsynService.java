package com.sliu.springtest.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @PackageName:com.sliu.springtest.service
 * @ClassName:AsynService
 * @Description:
 * @author:sliu
 * @data 2022/5/1 9:36
 */
@Service
@Async
public class AsynService {

    public void hello(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("processing");
    }
}
