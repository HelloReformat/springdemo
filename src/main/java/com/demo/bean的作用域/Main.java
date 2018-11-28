package com.demo.bean的作用域;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new FileSystemXmlApplicationContext("D:\\SpringBoot_WorkSpace\\springdemo\\src\\main\\java\\com\\demo\\bean的作用域\\Context.xml");
        Student s1 = (Student) ac.getBean("demo1");
        Student s2 = (Student) ac.getBean("demo1");
        System.out.println("单例："+"\n"+s1+"\n"+s2);
        Student s3 = (Student) ac.getBean("demo2");
        Student s4 = (Student) ac.getBean("demo2");
        System.out.println("非单例："+"\n"+s3+"\n"+s4);
    }
}
