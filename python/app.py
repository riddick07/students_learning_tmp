import data_container
import client
import json

cities = data_container.getCities()
countries = data_container.getCountries()
heights = data_container.getHeights()
obj = data_container.buildingObject

#client.printTask(obj, cities, countries, heights)
#client.printLists(cities, countries, heights)
client.printPosition(obj, cities, countries, heights)

