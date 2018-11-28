package com.demo.通过全类名配置bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Student {
    private final String id;
    private final String name;
    private String data;
    private GirlFriend gf;
    private PhoneNumber number;
    private List<Car> car;
    private Map<String,Integer> grade;
    private Properties properties;
    private List family;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setGf(GirlFriend gf) {
        this.gf = gf;
    }

    public void setNumber(PhoneNumber number) {
        this.number = number;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }

    public void setGrade(Map<String, Integer> grade) {
        this.grade = grade;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setFamily(List family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\n' +
                "name='" + name + '\n' +
                "data='" + data + '\n' +
                "gf=" + gf +'\n'+
                "number=" + number +'\n'+
                "car=" + car +'\n'+
                "grade" + grade +'\n'+
                "properties" + properties +'\n'+
                "family" + family +'\n'+
                '}';
    }
}
