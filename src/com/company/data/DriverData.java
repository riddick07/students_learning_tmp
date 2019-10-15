package com.company.data;

public class DriverData {
    private PersonData driver;
    private String birthday;
    private int felonyCharges;         //Flensburg

    public PersonData getDriver() {
        return driver;
    }

    public void setDriver(PersonData driver) {
        this.driver = driver;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getFelonyCharges() {
        return felonyCharges;
    }

    public void setFelonyCharges(int felonyCharges) {
        this.felonyCharges = felonyCharges;
    }
}
