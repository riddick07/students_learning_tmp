package com.company;

import java.util.List;

public class ForestData {

    private List<TreeDto> trees;

    public List<TreeDto> getTrees() {
        return trees;
    }

    public void setTrees(List<TreeDto> trees) {
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
