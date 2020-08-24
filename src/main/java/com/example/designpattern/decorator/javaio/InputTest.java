package com.example.designpattern.decorator.javaio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author liuguobin
 * @Title: InputTest
 * @ProjectName spring-boot-mybatisplus-3.1.x
 * @Description: 输入测试类
 * @date 2020/7/2 3:44 PM
 */
public class InputTest {

    public static void main(String[] args) {

        int c;
        try {
            InputStream inputStream =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("/Users/liuguobin/Downloads/test.text")));
            while ((c = inputStream.read()) >= 0) {
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
