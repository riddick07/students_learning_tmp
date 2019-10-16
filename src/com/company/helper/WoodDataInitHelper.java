package com.company.helper;

import com.company.data.ForestData;
import com.company.data.LocationsData;
import com.company.data.TreeData;

import java.util.ArrayList;
import java.util.List;

public class WoodDataInitHelper {

    public static List<ForestData> init() {
        List<ForestData> forests = new ArrayList<>();
        List<TreeData> trees = new ArrayList<>();

        ForestData forestData = new ForestData();

        TreeData treeData1 = new TreeData();
        treeData1.setAgeInDays(125330);
        treeData1.setColor("blue");
        treeData1.setHeight(333);
        treeData1.setOrigin("moon");
        treeData1.setType("sometree");


        TreeData treeData2 = new TreeData();
        treeData2.setAgeInDays(3232);
        treeData2.setColor("Yellow");
        treeData2.setHeight(2112122);
        treeData2.setOrigin("China");
        treeData2.setType("yellow tree");

        trees.add(treeData1);
        trees.add(treeData2);


        LocationsData locationsData1 = new LocationsData();
        locationsData1.setName("USA");
        locationsData1.setLatitude(777.9);
        locationsData1.setLongitude(44.8);

        forestData.setTrees(trees);
        forestData.setLocation(locationsData1);
        forests.add(forestData);


        //---------------------------------------

        List<TreeData> trees2 = new ArrayList<>();

        ForestData forestData2 = new ForestData();

        TreeData treeData12 = new TreeData();
        treeData12.setAgeInDays(1250);
        treeData12.setColor("green");
        treeData12.setHeight(35);
        treeData12.setProduce("apple");
        treeData12.setOrigin("germany");
        treeData12.setType("apple tree");


        TreeData treeData22 = new TreeData();
        treeData22.setAgeInDays(3232);
        treeData22.setColor("green");
        treeData22.setHeight(21);
        treeData22.setOrigin("germany");
        treeData22.setType("cherry tree");

        trees2.add(treeData22);
        trees2.add(treeData12);


        LocationsData locationsData12 = new LocationsData();
        locationsData12.setName("Kronberg");
        locationsData12.setLatitude(50);
        locationsData12.setLongitude(60);

        forestData2.setTrees(trees2);
        forestData2.setLocation(locationsData12);
        forests.add(forestData);

        return forests;
    }
}