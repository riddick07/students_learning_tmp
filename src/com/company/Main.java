package com.company;

import com.company.data.BuildingData;
import com.company.data.CarData;
import com.company.data.ForestData;
import com.company.data.RoadData;
import com.company.helper.BuildingDataInitHelper;
import com.company.helper.CarDataInitHelper;
import com.company.helper.RoadDataInitHelper;
import com.company.helper.WoodDataInitHelper;
import com.google.gson.Gson;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Gson gson = new Gson();

        List<BuildingData> buildingData = BuildingDataInitHelper.init();
        List<CarData> carData = CarDataInitHelper.init();
        List<RoadData> roadData = RoadDataInitHelper.init();
        List<ForestData> forestData = WoodDataInitHelper.init();

//        String bJson = gson.toJson(buildingData);
//        String cJson = gson.toJson(carData);
//        String rJson = gson.toJson(roadData);
//        String fJson = gson.toJson(forestData);
//
//        System.out.println("Building: " + bJson);
//        System.out.println("Car: " + cJson);
//        System.out.println("Road: " + rJson);
//        System.out.println("Forest: " + fJson);


        for (CarData carDatum : carData) {
            if (carDatum.getDriver().getAge() > 25) {
                System.out.println("Insurance Contributions: " + carDatum.getInsurance().getContribution() + "€");
                System.out.println("Insurance Class: " + carDatum.getInsurance().getClazz());
            }

        }
    }
}
