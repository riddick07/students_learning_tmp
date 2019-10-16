package com.company.helper;

import com.company.data.CarData;
import com.company.data.DriverData;
import com.company.data.InsuranceData;

import java.util.ArrayList;
import java.util.List;

public class CarDataInitHelper {

    public static List<CarData> init() {
        List<CarData> list = new ArrayList<>();

        CarData carData1 = new CarData();
        carData1.setDriver(getDriverData1());
        carData1.setInsurance(getInsuranceData1()); //numeration??

        carData1.setBrand("Skoda");
        carData1.setModel("Fabia");
        carData1.setColour("Red");
        carData1.setLicencePlate("KYFRM148");
        carData1.setLicenceCountry("Germany");
        carData1.setDoors(5);
        carData1.setWheels(4);
        carData1.setHorsepower(65);

        list.add(carData1);


        CarData carData2 = new CarData();
        carData2.setDriver(getDriverData2());
        carData2.setInsurance(getInsuranceData2());

        carData2.setBrand("VW");
        carData2.setModel("Lupo");
        carData2.setColour("Light Blue");
        carData2.setLicencePlate("KYFSB345");
        carData2.setLicenceCountry("Germany");
        carData2.setDoors(5);
        carData2.setWheels(4);
        carData2.setHorsepower(60);

        list.add(carData2);


        CarData carData3 = new CarData();
        carData3.setDriver(getDriverData3());
        carData3.setInsurance(getInsuranceData3());

        carData3.setBrand("VW");
        carData3.setModel("KnowCars");
        carData3.setColour("Blue");
        carData3.setLicencePlate("KYFAB678");
        carData3.setLicenceCountry("Germany");
        carData3.setDoors(5);
        carData3.setWheels(4);
        carData3.setHorsepower(60);

        list.add(carData3);


        CarData carData4 = new CarData();
        carData4.setDriver(getDriverData4());
        carData4.setInsurance(getInsuranceData4());

        carData4.setBrand("VW");
        carData4.setModel("KnowCars");
        carData4.setColour("Blue");
        carData4.setLicencePlate("KYFAM912");
        carData4.setLicenceCountry("Germany");
        carData4.setDoors(5);
        carData4.setWheels(4);
        carData4.setHorsepower(85);

        list.add(carData4);

        return list;
    }

    public static InsuranceData getInsuranceData1() {
        InsuranceData insuranceData1 = new InsuranceData();

        insuranceData1.setCompany("Allianz");
        insuranceData1.setHasInsurance(true);
        insuranceData1.setExpiry("16.8.2022");
        insuranceData1.setContact("V. Beutler");
        insuranceData1.setRegion("Erfurt");
        insuranceData1.setClazz(3);
        insuranceData1.setContribution(34.60);
        return insuranceData1;
    }

    public static InsuranceData getInsuranceData2() {
        InsuranceData insuranceData2 = new InsuranceData();

        insuranceData2.setCompany("Allianz");
        insuranceData2.setHasInsurance(true);
        insuranceData2.setExpiry("16.8.2022");
        insuranceData2.setContact("V. Beutler");
        insuranceData2.setRegion("Erfurt");
        insuranceData2.setClazz(2);
        insuranceData2.setContribution(24.50);
        return insuranceData2;
    }


    public static InsuranceData getInsuranceData3() {
        InsuranceData insuranceData3 = new InsuranceData();

        insuranceData3.setCompany("Allianz");
        insuranceData3.setHasInsurance(true);
        insuranceData3.setExpiry("16.8.2022");
        insuranceData3.setContact("V. Beutler");
        insuranceData3.setRegion("Erfurt");
        insuranceData3.setClazz(1);
        insuranceData3.setContribution(13.60);
        return insuranceData3;
    }

    public static InsuranceData getInsuranceData4() {
        InsuranceData insuranceData4 = new InsuranceData();

        insuranceData4.setCompany("Allianz");
        insuranceData4.setHasInsurance(true);
        insuranceData4.setExpiry("16.8.2022");
        insuranceData4.setContact("V. Beutler");
        insuranceData4.setRegion("Erfurt");
        insuranceData4.setClazz(1);
        insuranceData4.setContribution(16.70);
        return insuranceData4;
    }


    public static DriverData getDriverData1() {
        DriverData driverData1 = new DriverData();


        driverData1.setFelonyCharges(0);
        driverData1.setFirstName("Alexander");
        driverData1.setLastName("Beutler");

        driverData1.setBirthday("08.07.2001");
        driverData1.setAge(18);
        driverData1.setNationality("German");
        driverData1.setAlive(true);
        driverData1.setJob("Student");
        driverData1.setChildren(0);
        driverData1.setMarried(false);
        driverData1.setHigh(1.76);
        driverData1.setAddress("Augartenstraße 112-223, Mannheim");
        return driverData1;
    }

    public static DriverData getDriverData2() {

        DriverData driverData2 = new DriverData();

        driverData2.setFelonyCharges(0);
        driverData2.setFirstName("Sarah");
        driverData2.setLastName("Beutler");

        driverData2.setBirthday("28.08.1988");
        driverData2.setAge(31);
        driverData2.setNationality("German");
        driverData2.setAlive(true);
        driverData2.setJob("Student");
        driverData2.setChildren(0);
        driverData2.setMarried(false);
        driverData2.setHigh(1.64);
        driverData2.setAddress("Dresden");
        return driverData2;
    }

    public static DriverData getDriverData3() {
        DriverData driverData3 = new DriverData();


        driverData3.setFelonyCharges(0);
        driverData3.setFirstName("Volker");
        driverData3.setLastName("Beutler");

        driverData3.setBirthday("03.01");
        driverData3.setAge(56);
        driverData3.setNationality("German");
        driverData3.setAlive(true);
        driverData3.setJob("Insurant");
        driverData3.setChildren(2);
        driverData3.setMarried(true);
        driverData3.setHigh(1.75);
        driverData3.setAddress("Mühlstraße 4, Heldrungen");
        return driverData3;
    }

    public static DriverData getDriverData4() {

        DriverData driverData4 = new DriverData();


        driverData4.setFelonyCharges(0);
        driverData4.setFirstName("Angela");
        driverData4.setLastName("Beutler");

        driverData4.setBirthday("08.07.2001");
        driverData4.setAge(53);
        driverData4.setNationality("German");
        driverData4.setAlive(true);
        driverData4.setJob("Retired");
        driverData4.setChildren(2);
        driverData4.setMarried(false);
        driverData4.setHigh(1.65);
        driverData4.setAddress("Mühlstraße 4, Heldrungen");

        return driverData4;
    }

}
