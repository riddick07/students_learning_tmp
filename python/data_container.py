#!/usr/bin/env python3

import json

buildingObject = {
    "city":"Frankfurt",
    "country":"Germany",
    "height": 25
}


cities = ["Frankfurt", "Warsaw", "New York"]
countries = ["Germany", "Poland", "USA"]
heights = [25,40,10]


def getBuildingObject():
    return buildingObject

def getCities():
    return cities

def getCountries():
    return countries

def getHeights():
    return heights