package com.demo.bean的继承与依赖;

public class People {
    private String name;
    private String job;
    private Car car;

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", car=" + car +
                '}';
    }
}
