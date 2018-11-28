package com.demo.通过工厂方法配置bean;

import java.util.HashMap;
import java.util.Map;


/**
 * 实例工厂方法
 * 需要工厂方法本身，再调用工厂的实例方法来返回bean的实例
 */
public class InstanceStudentFactory {
    private Map<String,Student> students;

    public InstanceStudentFactory() {
        students = new HashMap<>();
        students.put("Reformat",new Student(20162590,"Reformat"));
        students.put("Nan",new Student(20162516,"Nan"));

    }

    public Student getStudentOf(String name){
        return students.get(name);
    }
}
