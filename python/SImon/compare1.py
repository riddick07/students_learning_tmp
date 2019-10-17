import json

def compare1(roadObject, roadObject1,roadObjectList):

    for i in range(len(roadObjectList)):
        road = json.dumps(roadObjectList[i])
        if (roadObject[road] == roadObject1[road]):
            print("Stelle: ", i, roadObject[road])
            bool=1
        if (bool == 0):
            print("Keine Übereinstimmung!")