package com.demo.autowire;

public class GirdFriend {
    private String name;
    private String bar;

    public void setName(String name) {
        this.name = name;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    @Override
    public String toString() {
        return "GirdFriend{" +
                "name='" + name + '\'' +
                ", bar='" + bar + '\'' +
                '}';
    }
}
