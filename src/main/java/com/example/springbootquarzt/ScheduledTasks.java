package com.example.springbootquarzt;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 326944 on 2017/7/19.
 */
@Component
@Configurable
@EnableScheduling
public class ScheduledTasks{

    public void work(){
        System.out.println ("Quartz 测试" + dateFormat ().format (new Date()));
    }
    private SimpleDateFormat dateFormat(){
        return new SimpleDateFormat ("HH:mm:ss");
    }
}
