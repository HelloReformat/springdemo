package com.demo.通过全类名配置bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext ac = new FileSystemXmlApplicationContext("src\\resources\\application_context.xml");
        Student reformat = (Student) ac.getBean("student");
        Student nan = (Student) ac.getBean("student2");
        System.out.println(reformat);
        System.out.println(nan);
    }
}
