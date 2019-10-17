package com.company.helper;

import com.company.data.*;
import com.company.tasks.ILocations;

import java.util.ArrayList;
import java.util.List;

public class BuildingDataInitHelper implements ILocations {

    public static List<BuildingData> init(){

        List<BuildingData> list = new ArrayList<>();

        BuildingData buildingData = new BuildingData();
        buildingData.setCity("Frankfurt");
        buildingData.setType("Skyscraper");
        buildingData.setCountry("Germany");
        buildingData.setUse("Post Office");
        buildingData.setFloors(150);
        buildingData.setWindows(1750);
        buildingData.setCompletionYear(1980);
        buildingData.setConstructionDuration(14);
        buildingData.setOpen(true);
        buildingData.setSizeData(getSizeData());

        PriceData priceData = new PriceData();
        priceData.setAmount(980000000);
        priceData.setCurrency("US Dollar");
        priceData.setCode("USD");
        priceData.setCurrencyNumber(1);
        priceData.setIntroduction(123);

        PersonData personData = new PersonData();
        personData.setFirstName("Generic");
        personData.setLastName("Architect");
        buildingData.setArchitect(personData);

        buildingData.setCost(priceData);

        list.add(buildingData);

        BuildingData buildingData1 = new BuildingData();
        buildingData1.setCity("New York");
        buildingData1.setType("Skyscraper");
        buildingData1.setCountry("United States of America");
        buildingData1.setUse("Office Building");
        buildingData1.setFloors(200);
        buildingData1.setWindows(1800);
        buildingData1.setCompletionYear(1985);
        buildingData1.setConstructionDuration(20);
        buildingData1.setOpen(true);
        buildingData1.setSizeData(getSizeData1());

        PriceData priceData1 = new PriceData();
        priceData1.setAmount(98000000);
        priceData1.setCurrency("US Dollar");
        priceData1.setCode("USD");
        priceData1.setCurrencyNumber(1);
        priceData1.setIntroduction(123);

        buildingData.setCost(priceData1);

        PersonData personData1 = new PersonData();
        personData1.setFirstName("Another");
        personData1.setLastName("Architect");
        buildingData1.setArchitect(personData1);


        list.add(buildingData1);

        return list;
    }

    public static SizeData getSizeData() {
        SizeData sizeData = new SizeData();
        sizeData.setHeight(20);
        sizeData.setLength(200000);
        sizeData.setWidth(36);
        return sizeData;
    }


    public static SizeData getSizeData1() {
        SizeData sizeData = new SizeData();
        sizeData.setHeight(55);
        sizeData.setLength(200000);
        sizeData.setWidth(36);
        return sizeData;
    }

    @Override
    public LocationsData getClosestLocation(List<LocationsData> locations) {
        LocationsData locationsData = new LocationsData();
        System.out.println();
        for (LocationsData location : locations) {
            double lat = location.getLatitude();
            double lon = location.getLongitude();
            if (lat > 45 && lon > 6) {
                return location;
            }
        }

        return null;
    }
}
