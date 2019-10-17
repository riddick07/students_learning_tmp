roadObject = {
    "roadName" : "Main Street",
    "speedLimit" : 130.0,
    "lanes" : 6,
    "minimumSpeed" : 61.0,
}
roadObject1 = {
    "roadName" : "5th Avenue",
    "speedLimit" : 100.0,
    "lanes" : 7,
    "minimumSpeed" : 31.0,
}

roadObjectList = ["roadName", "speedLimit", "lanes", "minimumSpeed"]
roadNames = ["Main Street", "5th Avenue", "Highway No.1", "Broadway Street", "Main Street"]
speedLimits = [130, 0, 30, 60, 100, 130]
lanes = [1, 2, 4, 6, 8]
minimumSpeeds = [1, 31, 61]

def getRoadObjectList():
    return roadObjectList

def getRoadObject():
    return roadObject

def getRoadObject1():
    return roadObject1

def getRoadNames():
    return roadNames

def getSpeedlimits():
    return speedLimits

def getLanes():
    return lanes

def getMiniumSpeeds():
    return minimumSpeeds

