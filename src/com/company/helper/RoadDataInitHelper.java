package com.company.helper;

import com.company.data.BuildingData;
import com.company.data.RoadData;
import com.company.data.SizeData;
import com.company.data.SurfaceData;

import java.util.ArrayList;
import java.util.List;

public class RoadDataInitHelper {

    public static List<RoadData> init() {
        List<RoadData> list = new ArrayList<>();


        RoadData roadData = new RoadData();
        roadData.setLanes(6);
        roadData.setMinimumSpeed(61);
        roadData.setOpened(true);
        roadData.setRoadName("Hauptstrasse");
        roadData.setSpeedLimit(150);

        SurfaceData surfaceData = getSurfaceData();
        SizeData sizeData = getSizeData();

        roadData.setSurface(surfaceData);
        roadData.setSize(sizeData);

        list.add(roadData);

        RoadData roadData1 = new RoadData();
        roadData1.setLanes(2);
        roadData1.setMinimumSpeed(0);
        roadData1.setOpened(true);
        roadData1.setRoadName("Turmgasse");
        roadData1.setSpeedLimit(30);

        SurfaceData surfaceData1 = getSurfaceData1();
        SizeData sizeData1 = getSizeData1();

        roadData1.setSurface(surfaceData1);
        roadData1.setSize(sizeData1);

        list.add(roadData1);
        return list;
    }

    public static SizeData getSizeData() {
        SizeData sizeData = new SizeData();
        sizeData.setHeight(0);
        sizeData.setLength(200000);
        sizeData.setWidth(36);
        return sizeData;
    }

    public static SurfaceData getSurfaceData() {
        SurfaceData surfaceData = new SurfaceData();
        surfaceData.setMaterial("tarmac");
        surfaceData.setThickness(20);
        return surfaceData;
    }
    public static SizeData getSizeData1() {
        SizeData sizeData1 = new SizeData();
        sizeData1.setHeight(0);
        sizeData1.setLength(3000);
        sizeData1.setWidth(10);
        return sizeData1;
    }

    public static SurfaceData getSurfaceData1() {
        SurfaceData surfaceData1 = new SurfaceData();
        surfaceData1.setMaterial("tarmac");
        surfaceData1.setThickness(20);
        return surfaceData1;
    }
}
