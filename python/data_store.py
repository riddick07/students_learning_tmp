treeObject = [{
    "type": "apple tree",
    "color": "green",
    "origin": "germany",
    "produce": "apple",
    "ageInDays": 1250,
    "height": 35
},{
    "type": "cherry tree",
    "color": "red",
    "origin": "everywhere",
    "produce": "cherry",
    "ageInDays": 125220,
    "height": 315
}

]
locationObject = [{
        "name": "Freiburg",
        "longitude": 7.8,
        "latitude": 47.9
},{
        "name": "Kronberg",
        "longitude": 222.8,
        "latitude": 417.9
}
]

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