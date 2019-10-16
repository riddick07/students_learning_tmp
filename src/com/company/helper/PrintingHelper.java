package com.company.helper;

import com.company.data.*;

import java.util.List;

public class PrintingHelper {

    public  void printForestData(List<ForestData> forestData) {
        for (ForestData forestland : forestData) {
            List<TreeData> trees = forestland.trees;
            for (TreeData three : trees) {
                if (three.getAgeInDays() > 2000) {
                    System.out.println("In the " + forestland.getLocation().getName() + " is a tree of the type: " + three.type + ", which is older than 2000 days.");
                }
            }
        }
    }

    public  void printCarData(List<CarData> carData) {
        for (CarData carDatum : carData) {
            if (carDatum.getDriver().getAge() > 25) {
                System.out.println("Insurance Contributions: " + carDatum.getInsurance().getContribution() + "€");
                System.out.println("Insurance Class" + carDatum.getInsurance().getClazz());
            }
        }
    }

    public  void printBuildingData(List<BuildingData> buildingData) {
        for (BuildingData buildingDatum : buildingData) {
            if (buildingDatum.getSizeData().getHeight() > 25) {
                System.out.println(buildingDatum.getArchitect().getFirstName() + " "
                        + buildingDatum.getArchitect().getLastName() + " designed a building higher than 25m.");
            }
        }
    }

    public  void printRoadData(List<RoadData> roadData) {
        for (RoadData roadDatum : roadData) {
            if (roadDatum.getSize().getWidth() > 20) {
                System.out.println("Road name: " + roadDatum.getRoadName() + "\n" + "Speed limit :" + roadDatum.getSpeedLimit());
            }
        }
    }

}
