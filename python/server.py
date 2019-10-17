#!/usr/bin/env python3

treeObject =  {
      "type": "apple tree",
      "color": "green",
      "origin": "germany",
      "produce": "apple",
      "ageInDays": 1250,
      "height": 35
}
locationObject = {
  "location": {
    "name": "Freiburg",
    "longitude": 7.8,
    "latitude": 47.9
}


adj = ["red", "big", "tasty"]
fruits = ["apple", "banana", "cherry"]

def getFruits():
 return fruits

def getAdjactives():
 return adj

def getTree():
 return treeObject

def getLocation():
 return locationObject