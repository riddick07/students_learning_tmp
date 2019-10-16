package com.company.helper;

import com.company.data.BuildingData;
import com.company.data.PriceData;

import java.util.ArrayList;
import java.util.List;

public class BuildingDataInitHelper {

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
        buildingData.setSizeData(RoadDataInitHelper.getSizeData());

        PriceData priceData = new PriceData();
        priceData.setAmount(980000000);
        priceData.setCurrency("US Dollar");
        priceData.setCode("USD");
        priceData.setCurrencyNumber(1);
        priceData.setIntroduction(123);

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
        buildingData1.setSizeData(RoadDataInitHelper.getSizeData());

        PriceData priceData1 = new PriceData();
        priceData1.setAmount(98000000);
        priceData1.setCurrency("US Dollar");
        priceData1.setCode("USD");
        priceData1.setCurrencyNumber(1);
        priceData1.setIntroduction(123);

        buildingData.setCost(priceData1);

        list.add(buildingData1);

        return list;
    }

}
