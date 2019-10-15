package com.company;

public class PersonData {

    public String firstName;
    public String lastName;
    public int age;
    public String nationality;
    public boolean isAlive;
    public String job;
    public int children;
    public boolean isMarried;
    private String name;
    private double high;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
