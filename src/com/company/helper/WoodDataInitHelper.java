package com.company.helper;

import com.company.data.ForestData;
import com.company.data.LocationsData;
import com.company.data.TreeData;

import java.util.ArrayList;
import java.util.List;

public class WoodDataInitHelper {

    public static ForestData init(){
        ForestData forestData = new ForestData();
        forestData.setLocation(getLocationData());
        forestData.setTrees(getTreesData());
        return forestData;
    }

    public static List<TreeData> getTreesData() {
        List<TreeData> trees = new ArrayList<>();

        TreeData treeData = getTreeData();
        TreeData treeDataTest = getTreeDataTest();
        trees.add(treeData);
        trees.add(treeDataTest);

        return trees;
    }

    public static TreeData getTreeData() {
        TreeData treeData = new TreeData();
        treeData.setAgeInDays(1250);
        treeData.setColor("green");
        treeData.setHeight(35);
        treeData.setProduce("apple");
        treeData.setOrigin("germany");
        treeData.setType("apple tree");
        return treeData;
    }

    public static TreeData getTreeDataTest() {
        TreeData treeData = new TreeData();
        treeData.setAgeInDays(3232);
        treeData.setColor("green");
        treeData.setHeight(21);
        treeData.setOrigin("germany");
        treeData.setType("cherry tree");
        return treeData;
    }

    public static LocationsData getLocationData() {
        LocationsData locationsData = new LocationsData();
        locationsData.setName("Freiburg");
        locationsData.setLatitude(47.9);
        locationsData.setLongitude(7.8);
        return locationsData;
    }
}
