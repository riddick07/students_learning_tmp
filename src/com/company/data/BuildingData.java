package com.company.data;

public class BuildingData {

    public String style;
    public String type;
    public String color;
    public PersonData architect;
    public String city;
    public String country;
    public String use;
    public int floors;
    public int windows;
    public int completionYear;
    public int constructionDuration;
    public SizeData sizeData;
    public PriceData cost;
    public boolean isOpen;

    public SizeData getSizeData() {
        return sizeData;
    }

    public void setSizeData(SizeData sizeData) {
        this.sizeData = sizeData;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public PersonData getArchitect() {
        return architect;
    }

    public void setArchitect(PersonData architect) {
        this.architect = architect;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public int getCompletionYear() {
        return completionYear;
    }

    public void setCompletionYear(int completionYear) {
        this.completionYear = completionYear;
    }

    public int getConstructionDuration() {
        return constructionDuration;
    }

    public void setConstructionDuration(int constructionDuration) {
        this.constructionDuration = constructionDuration;
    }

    public PriceData getCost() {
        return cost;
    }

    public void setCost(PriceData cost) {
        this.cost = cost;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}