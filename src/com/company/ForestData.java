package com.company;

import java.util.List;

public class ForestData {

    private List<TreeData> trees;

    public List<TreeData> getTrees() {
        return trees;
    }

    public void setTrees(List<TreeData> trees) {
        this.trees = trees;
    }

    public Locations getLocation() {
        return location;
    }

    public void setLocation(Locations location) {
        this.location = location;
    }

    private Locations location;

}
