package com.company.data;

public class RoadData {
    public String roadName;
    public double speedLimit;
    public int minimumSpeed;
    public int lanes;

    public boolean isOpened;
    //  public boolean isStreetViewable;

    public SizeData size;
    public SurfaceData surface;

    public String getRoadName() {
        return roadName;
    }

    public void setRoadName(String roadName) {
        this.roadName = roadName;
    }

    public double getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(double speedLimit) {
        this.speedLimit = speedLimit;
    }

    public int getMinimumSpeed() {
        return minimumSpeed;
    }

    public void setMinimumSpeed(int minimumSpeed) {
        this.minimumSpeed = minimumSpeed;
    }

    public int getLanes() {
        return lanes;
    }

    public void setLanes(int lanes) {
        this.lanes = lanes;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }

    public SizeData getSize() {
        return size;
    }

    public void setSize(SizeData size) {
        this.size = size;
    }

    public SurfaceData getSurface() {
        return surface;
    }

    public void setSurface(SurfaceData surface) {
        this.surface = surface;
    }
}
