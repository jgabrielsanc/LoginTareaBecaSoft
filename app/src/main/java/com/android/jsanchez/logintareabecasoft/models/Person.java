package com.android.jsanchez.logintareabecasoft.models;

import com.android.jsanchez.logintareabecasoft.utils.Util;

import java.io.Serializable;

/**
 *  Created by Jesus Sanchez
 */
public class Person implements Serializable {

    private String name;
    private String phone;
    private int photo;
    private String genre;
    private String birthday;
    private String career;
    private String address;

    public Person(String name, String phone, int photo, String genre, String birthday, String career, String address) {
        this.name = name;
        this.phone = phone;
        this.photo = photo;
        this.genre = genre;
        this.birthday = birthday;
        this.career = career;
        this.address = address;
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

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
