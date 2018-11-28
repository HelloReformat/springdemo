package com.demo.SpEL;

public class Address {
    public int area;
    public String Location;

    public void setArea(int area) {
        this.area = area;
    }

    public void setLocation(String location) {
        Location = location;
    }

    @Override
    public String toString() {
        return "Address{" +
                "area=" + area +
                ", Location='" + Location + '\'' +
                '}';
    }
}
