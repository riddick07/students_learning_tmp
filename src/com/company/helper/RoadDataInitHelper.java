package com.company.helper;

import com.company.data.RoadData;
import com.company.data.SizeData;
import com.company.data.SurfaceData;

public class RoadDataInitHelper {

    public static void init() {
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
    }

    private static SizeData getSizeData() {
        SizeData sizeData = new SizeData();
        sizeData.setHeight(0);
        sizeData.setLength(200000);
        sizeData.setWidth(36);
        return sizeData;
    }

    private static SurfaceData getSurfaceData() {
        SurfaceData surfaceData = new SurfaceData();
        surfaceData.setMaterial("tarmac");
        surfaceData.setThickness(20);
        return surfaceData;
    }
}
