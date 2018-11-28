package com.demo.通过工厂方法配置bean;

public class Student {
    private long id;
    private String name;

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
