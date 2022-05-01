package com.sliu.springtest.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @PackageName:com.sliu.springtest.service
 * @ClassName:ScheduleService
 * @Description:
 * @author:sliu
 * @data 2022/5/1 11:08
 */

@Service
public class ScheduleService {

    /*
        30 10 11 * * ?      每天11:30:11执行一次
        30 0/5 10,18 * * ?  每天10和18点，每隔五分钟执行一次
        0 15 10 ? * 1-6     每个月周1-6，10:15:00执行一次

     */
    @Scheduled(cron = "50 16 11 * * ?")
    public void hello(){
        System.out.println("执行了====>Schedule指定的hello！");
    }
}
