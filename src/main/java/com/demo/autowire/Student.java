package com.demo.autowire;

public class Student {
    private Car car;
    private GirdFriend gf;

    public void setCar(Car car) {
        this.car = car;
    }

    public void setGf(GirdFriend gf) {
        this.gf = gf;
    }

    @Override
    public String toString() {
        return "Student{" +
                "car=" + car +
                "\n" +
                ", gf=" + gf +
                '}';
    }
}
