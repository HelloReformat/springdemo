package com.demo.管理bean的生命周期;



public class Car {
    private String name;

    public Car() {
        System.out.println("Constructor...");
    }

    public void setName(String name) {
        System.out.println("设置属性值");
        this.name = name;
    }

    public void initMethod(){
        System.out.println("init...");
    }

    public void destroyMethod(){
        System.out.println("destroy...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
