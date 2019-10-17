#!/usr/bin/env python3


obj = {
  "roadName": "Hauptstrasse",
  "speedLimit": 150.0,
  "minimumSpeed": 61,
}

def printList(list, suffixElements):
    for x in suffixElements:
        for y in list:
            print(x, y)