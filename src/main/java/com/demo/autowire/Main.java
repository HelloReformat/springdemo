package com.demo.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new FileSystemXmlApplicationContext("D:\\SpringBoot_WorkSpace\\springdemo\\src\\main\\java\\com\\demo\\autowire\\context.xml");
        Student s1 = (Student) ac.getBean("Student1");
        System.out.println(s1);
        Student s2 = (Student) ac.getBean("Student1");
        System.out.println(s2);
    }
}
