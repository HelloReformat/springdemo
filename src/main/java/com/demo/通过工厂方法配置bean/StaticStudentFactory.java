package com.demo.通过工厂方法配置bean;

import java.util.HashMap;
import java.util.Map;

/***直接工厂方法
 * 直接调用某个类的静态块就可以返回Bean的实例
 */
public class StaticStudentFactory {
    private static Map<String,Student> students = new HashMap();

    static{
        students.put("Reformat",new Student(20162590,"Reformat"));
        students.put("Nan",new Student(20162516,"Nan"));
    }

    public static Student getStudentOf(String name){
        return students.get(name);
    }
}
