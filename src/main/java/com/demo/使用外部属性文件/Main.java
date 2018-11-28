package com.demo.使用外部属性文件;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac = new FileSystemXmlApplicationContext("D:\\SpringBoot_WorkSpace\\springdemo\\src\\main\\java\\com\\demo\\使用外部属性文件\\Context.xml");
        DataSource ds = (DataSource) ac.getBean("dataSource");
        System.out.println(ds);
    }
}
