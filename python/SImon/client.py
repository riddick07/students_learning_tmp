#!/usr/bin/env python3
import json


def printList(roadObject, roadNames, speedLimits, lanes, minimumSpeeds):
    for i in range(len(roadNames)):
        road = roadNames[i]
        if (road == roadObject["roadName"]):
            print("Position:", i, "roadName:", road)
        else:
            print("no RoadName found")

    for y in range(len(speedLimits)):
        road =  speedLimits[y]
        if (road == roadObject["speedLimit"]):
            print("Position:", y, "Speedlimit:", road)
        else:
            print("no SpeedLimit found")

    for x in range(len(lanes)):
        road = lanes[x]
        if (road == roadObject["lanes"]):
            print("Position:", x, "Lanes:", road)
        else:
            print("no Lanes found")

    for z in range(len(minimumSpeeds)):
        road = minimumSpeeds[z]
        if (road == roadObject["minimumSpeed"]):
            print("Position:", z, "minimumSpeed:", road)
        else:
            print("no MinimumSpeed found")

    print(roadObject)
