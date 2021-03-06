package com.example.springbootquarzt;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 326944 on 2017/7/19.
 */
@Component
@Configurable
@EnableScheduling //标注启动定时任务
//spring-boot自带的定时任务
public class SchedTask {

    //每30秒执行一次
    @Scheduled(fixedRate = 1000 * 30)
    public void reportCurrentTime(){
        System.out.println ("Scheduling Tasks Examples: The time is now " + dateFormat ().format (new Date()));
    }

    //每5秒执行一次
    @Scheduled(cron = "*/5 * *  * * * ")
    public void reportCurrentByCron(){
        System.out.println ("Scheduling Tasks Examples By Cron: The time is now " + dateFormat ().format (new Date ()));
    }

    private SimpleDateFormat dateFormat(){
        return new SimpleDateFormat ("HH:mm:ss");
    }

}
