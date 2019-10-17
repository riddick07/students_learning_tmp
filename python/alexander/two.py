import json
import one


def printList(list, suffixElements):
    for x in suffixElements:
        for y in list:
            print(x, y)


def printTwo(elementOne, elementTwo, elementThree):
    for x in elementOne:
        for y in elementTwo:
            for z in elementThree:
                print(x, y, z)


def printTask(eObject, colors, motors, brand):
    isFound = False
    for i in range(len(colors)):
        car = colors[i]
        if car == eObject["color"]:
            print(i, colors[i])
            isFound = True
    if (isFound == False):
        print("Not Found")

    isFound = False
    for i in range(len(motors)):
        car = motors[i]
        if car == eObject["motor"]:
            print(i, motors[i])
            isFound = True
    if (isFound == False):
        print("Not Found")

    isFound = False
    for i in range(len(brand)):
        car = brand[i]
        if car == eObject["brand"]:
            print(i, brand[i])
            isFound = True
    if (isFound == False):
        print("Not Found")


def printFancy(eOne, eTwo, eThree):
    for x in range(len(eOne)):  # run number x in range of length of Element 1 (loop for number of Elements in pretty)
        print(eOne(x))

    for x in range(len(eTwo)):
        print(eTwo(x))

    for x in range(len(eThree)):
        print(eThree(x))
