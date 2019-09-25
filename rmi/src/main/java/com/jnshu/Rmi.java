package com.jnshu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Rmi {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        context.getBean("checkNumServiceRmi");
        context.getBean("userServiceRmi");
        context.getBean("jobServiceRmi");
        System.out.println("启动服务");
    }
}