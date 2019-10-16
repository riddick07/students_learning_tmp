package com.company;

import com.company.data.*;
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

        for (RoadData roadDatum :roadData){
        if(roadDatum.getSize().getWidth() > 20){
                System.out.println("Roadname: " + roadDatum.getRoadName() + "\n" + "Speedlimit :" + roadDatum.getSpeedLimit());
            }
        }
        // print the location name of old trees

        for (ForestData forestland : forestData) {

            List<TreeData> trees = forestland.getTrees();

            for (TreeData three : trees) {
                if (three.ageInDays > 2000) {
                    System.out.println("In the " + forestland.getLocation().getName() + " is a tree of the type: " + three.type + ", which is older than 2000 days.");
                }
            }

        }

    }
}
