package com.company.data;

public class BuildingData {

    private String style;
    private String type;
    private String color;
    private PersonData architect;
    private String city;
    private String country;
    private String use;
    private int floors;
    private int windows;
    private int completionYear;
    private int constructionDuration;
    private int height;
    private PriceData cost;
    private boolean isOpen;


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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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