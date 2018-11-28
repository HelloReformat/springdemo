package com.demo.通过全类名配置bean;

public class PhoneNumber {
    private long nuumber;

    public void setNuumber(long nuumber) {
        this.nuumber = nuumber;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "nuumber=" + nuumber +
                '}';
    }
}
