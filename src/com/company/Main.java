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

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Gson gson = new Gson();

        BuildingData buildingData = BuildingDataInitHelper.init();
        CarData carData = CarDataInitHelper.init();
        RoadData roadData = RoadDataInitHelper.init();
        ForestData forestData = WoodDataInitHelper.init();

        String bJson = gson.toJson(buildingData);
        String cJson = gson.toJson(carData);
        String rJson = gson.toJson(roadData);
        String fJson = gson.toJson(forestData);

        System.out.println("Building: " + bJson);
        System.out.println("Car: " + cJson);
        System.out.println("Road: " + rJson);
        System.out.println("Forest: " + fJson);




    }
}
