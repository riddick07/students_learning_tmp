package com.company.data;

public class CarData {
    public String brand;
    public String model;
    public String colour;
    public String licencePlate;
    public String licenceCountry;
    public DriverData driver;
    public InsuranceData insurance;
    public int doors;
    public int wheels;
    public int horsepower;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public String getLicenceCountry() {
        return licenceCountry;
    }

    public void setLicenceCountry(String licenceCountry) {
        this.licenceCountry = licenceCountry;
    }

    public DriverData getDriver() {
        return driver;
    }

    public void setDriver(DriverData driver) {
        this.driver = driver;
    }

    public InsuranceData getInsurance() {
        return insurance;
    }

    public void setInsurance(InsuranceData insurance) {
        this.insurance = insurance;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}
