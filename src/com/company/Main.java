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

        List<BuildingData> buildingData = BuildingDataInitHelper.init();
        List<CarData> carData = CarDataInitHelper.init();
        List<RoadData> roadData = RoadDataInitHelper.init();
        List<ForestData> forestData = WoodDataInitHelper.init();


        for (RoadData roadDatum : roadData) {
            if (roadDatum.getSize().getWidth() > 20) {
                System.out.println("Roadname: " + roadDatum.getRoadName() + "\n" + "Speedlimit :" + roadDatum.getSpeedLimit());
            }
        }

        for (ForestData forestland : forestData) {
            List<TreeData> trees = forestland.getTrees();
            for (TreeData three : trees) {
                if (three.ageInDays > 2000) {
                    System.out.println("In the " + forestland.getLocation().getName() + " is a tree of the type: " + three.type + ", which is older than 2000 days.");
                }
            }
        }


        for (CarData carDatum : carData) {
            if (carDatum.getDriver().getAge() > 25) {
                System.out.println("Insurance Contributions: " + carDatum.getInsurance().getContribution() + "€");
                System.out.println("Insurance Class" + carDatum.getInsurance().getClazz());
            }
        }

        for (BuildingData buildingDatum : buildingData) {
            if (buildingDatum.getSizeData().getHeight() > 25) {
                System.out.println(buildingDatum.getArchitect().getFirstName() + " "
                        + buildingDatum.getArchitect().getLastName() + " designed a building higher than 25m.");
            }
        }
    }
}
