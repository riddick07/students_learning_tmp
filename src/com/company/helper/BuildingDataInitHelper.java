package com.company.helper;

import com.company.data.BuildingData;
import com.company.data.PriceData;

public class BuildingDataInitHelper {

    public static void init(){

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
    }

}
