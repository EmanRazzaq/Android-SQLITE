package com.example.sqlite.Model;

public class Contact {
    private int id;
    private String name;
    private String PhoneNumber;

    public Contact(String name, String phonenumber) {
        this.id = id;
        this.name = name;
        this.PhoneNumber = phonenumber;
    }

    public Contact(int id, String name, String phonenumber) {
        this.id = id;
        this.name = name;
        this.PhoneNumber = phonenumber;
    }


    public Contact() {
        this.id = id;
        this.name = name;
        this.PhoneNumber = PhoneNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phonenumber) {
        this.PhoneNumber = phonenumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }
}
