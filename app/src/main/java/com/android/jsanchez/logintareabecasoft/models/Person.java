package com.android.jsanchez.logintareabecasoft.models;

import com.android.jsanchez.logintareabecasoft.utils.Util;

public class Person {

    private String name;
    private String phone;
    private String color;

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.color = Util.getRandomColor();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getColor() {
        return color;
    }
}
