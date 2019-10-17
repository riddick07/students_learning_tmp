def compare(roadObject, roadObject1):
    road = roadObject["roadName"]
    bool=0
    if (road == roadObject1["roadName"]):
        print("Übereinstimmender Ausdruckin roadName=", road)
        bool=1
    road = roadObject["speedLimit"]
    if (road == roadObject1["speedLimit"]):
        print("Übereinstimmender Ausdruck in speedLimit=", road)
        bool=1
    road = roadObject["lanes"]
    if (road == roadObject1["lanes"]):
        print("Übereinstimmender Ausdruck in lanes=", road)
        bool=1
    road = roadObject["minimumSpeed"]
    if (road == roadObject1["minimumSpeed"]):
        print("Übereinstimmender Ausdruck in minimumSpeed=", road)
        bool=1
    if (bool == 0):
        print("keine Übereinstimmung!")
    if (bool ==1):
        print(roadObject,"\n",roadObject1)

