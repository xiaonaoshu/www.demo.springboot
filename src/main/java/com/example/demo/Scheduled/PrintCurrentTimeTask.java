package com.example.demo.Scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class PrintCurrentTimeTask {

    private  static  final SimpleDateFormat dataFormat=new SimpleDateFormat("HH:mm:ss");
    @Scheduled(cron = "0/5 * * * * ? ")    //每5秒打印当前时间
    public void printCurrentTime() {
        System.out.println("Current Time is:" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
    @Scheduled(fixedRate = 3000)
    public void test(){
        System.out.println("当前时间为："+dataFormat.format(new Date()));
    }
}
