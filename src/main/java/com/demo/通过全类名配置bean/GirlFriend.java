package com.demo.通过全类名配置bean;

public class GirlFriend {
    private final String name;
    private final String look;
    private final String loveDeep;

    public GirlFriend(String name, String look, String loveDeep) {
        this.name = name;
        this.look = look;
        this.loveDeep = loveDeep;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                ", look='" + look + '\'' +
                ", loveDeep='" + loveDeep + '\'' +
                '}';
    }
}
