package com.demo.SpEL;

public class People {
    private String name;
    private Address address;
    private String city;
    private String info;

    public void setName(String name) {
        this.name = name;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", info='" + info + '\'' +
                '}';
    }
}
