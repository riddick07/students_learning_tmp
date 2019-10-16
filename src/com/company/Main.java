package com.company;

import com.company.data.BuildingData;
import com.company.data.CarData;
import com.company.data.ForestData;
import com.company.data.RoadData;
import com.company.helper.*;

import java.util.List;

public class Main {

    static PrintingHelper printingHelper;

    public static void main(String[] args) {

        List<BuildingData> buildingData = BuildingDataInitHelper.init();
        List<CarData> carData = CarDataInitHelper.init();
        List<RoadData> roadData = RoadDataInitHelper.init();
        List<ForestData> forestData = WoodDataInitHelper.init();

        if (printingHelper == null) {
            printingHelper = new PrintingHelper();
        }

        printingHelper.printRoadData(roadData);
        printingHelper.printForestData(forestData);
        printingHelper.printCarData(carData);
        printingHelper.printBuildingData(buildingData);
    }


}
