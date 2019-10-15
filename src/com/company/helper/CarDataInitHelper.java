package com.company.helper;

import com.company.data.CarData;
import com.company.data.DriverData;
import com.company.data.InsuranceData;

import java.util.ArrayList;
import java.util.List;

public class CarDataInitHelper {

    public static CarData init() {
        CarData carData = new CarData();
        carData.setDriver(getDriverData());
        carData.setInsurance(getInsuranceData());

        carData.setBrand("Skoda");
        carData.setModel("Fabia");
        carData.setColour("Red");
        carData.setLicencePlate("KYFRM148");
        carData.setLicenceCountry("Germany");
        carData.setDoors(5);
        carData.setWheels(4);
        carData.setHorsepower(65);

        return carData;
    }

    private static InsuranceData getInsuranceData() {
        InsuranceData insuranceData = new InsuranceData();

        insuranceData.setCompany("Allianz");
        insuranceData.setHasInsurance(true);
        insuranceData.setExpiry("16.8.2022");
        insuranceData.setContact("V. Beutler");
        insuranceData.setRegion("Erfurt");
        insuranceData.setClazz(3);
        insuranceData.setContribution(34.60);

        return insuranceData;

    }

    private static DriverData getDriverData() {
        DriverData driverData = new DriverData();


        driverData.setFelonyCharges(0);
        driverData.setFirstName("Alexander");
        driverData.setLastName("Beutler");

        driverData.setBirthday("08.07.2001");
        driverData.setAge(18);
        driverData.setNationality("German");
        driverData.setAlive(true);
        driverData.setJob("Student");
        driverData.setChildren(0);
        driverData.setMarried(false);
        driverData.setHigh(1.76);
        driverData.setAddress("Augartenstraße 112-223, Mannheim");

        return driverData;
    }


}
