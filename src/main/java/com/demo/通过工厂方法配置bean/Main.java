package com.demo.通过工厂方法配置bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new FileSystemXmlApplicationContext("D:\\SpringBoot_WorkSpace\\springdemo\\src\\main\\java\\com\\demo\\通过工厂方法配置bean\\beans-factory.xml");
        System.out.println(ac.getBean("student1"));
        System.out.println(ac.getBean("student2"));

    }
}
