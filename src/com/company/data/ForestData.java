package com.company.data;

import java.util.List;

public class ForestData {

    public List<TreeData> trees;

    public List<TreeData> getTrees() {
        return trees;
    }

    public void setTrees(List<TreeData> trees) {
        this.trees = trees;
    }

    public LocationsData getLocation() {
        return location;
    }

    public void setLocation(LocationsData location) {
        this.location = location;
    }

    public LocationsData location;

}
