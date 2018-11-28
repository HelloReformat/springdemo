package com.demo.管理bean的生命周期;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext ac = new FileSystemXmlApplicationContext("D:\\SpringBoot_WorkSpace\\springdemo\\src\\main\\java\\com\\demo\\管理bean的生命周期\\Context.xml");
        System.out.println(ac.getBean("car"));
        ac.close();
    }
}
