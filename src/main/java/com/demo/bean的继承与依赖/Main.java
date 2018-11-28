package com.demo.bean的继承与依赖;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new FileSystemXmlApplicationContext("D:\\SpringBoot_WorkSpace\\springdemo\\src\\main\\java\\com\\demo\\bean的继承与依赖\\context.xml");
        System.out.println(ac.getBean("People_Reformat"));
        System.out.println(ac.getBean("Student2"));
    }
}
