#!/usr/bin/env python3

def printList(treeObj, types, colors, origin, produce):
    isFound = False
    for i in range(len(types)):
        trype = types[i]
        if trype == treeObj["types"]:
            print(i, types[i])
            isFound = True

    if not isFound:
        print("Tree is not found")


    # for i in range(len(types)):
    #     print(types[i])
    # for i in range(len(colors)):
    #     print(colors[i])
    # for i in range(len(origin)):
    #     print(origin[i])
    # for i in range(len(produce)):
    #     print(produce[i])

    # for i in range(len(types)):
    #     print("TreeType: ", types[i], "Color: ", colors[i], "Origin: ", origin[i], "Produce: ", produce[i])
