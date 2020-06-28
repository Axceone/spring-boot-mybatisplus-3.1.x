package com.example.mybatisplus;

import com.example.mybatisplus.config.SnowflakeIdWorker;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

/**
 * @author liuguobin
 * @Title: snowflake
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: TODO
 * @date 2020/6/5 10:14 AM
 */
public class snowflake {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        long startTime = System.nanoTime();
        CountDownLatch countDownLatch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            new Thread(() ->{
                for (int j = 0; j < 10000; j++) {
                    long id = SnowflakeIdWorker.generateId();
                    System.out.println(id + "--");
                }
                countDownLatch.countDown();
            }).start();
        }
        System.out.println((System.nanoTime()-startTime)/1000000+"ms");
    }

    @Test
    public void test02() {
        System.out.println(System.currentTimeMillis());
        long startTime = System.nanoTime();
        for (int j = 0; j < 10000; j++) {
            long id = SnowflakeIdWorker.generateId();
            System.out.println(id + "----");
        }
        System.out.println((System.nanoTime()-startTime)/1000000+"ms");
    }
}
