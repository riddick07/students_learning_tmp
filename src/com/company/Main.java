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


        for (RoadData roadDatum :roadData){
        if(roadDatum.getSize().getWidth() > 20){
                System.out.println("Roadname: " + roadDatum.getRoadName() + "\n" + "Speedlimit :" + roadDatum.getSpeedLimit());
            }
        }


    }
}
