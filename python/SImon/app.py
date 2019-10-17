import client
import data_container
import compare_objects
import compare1



roadNames = data_container.getRoadNames()
speedLimits = data_container.getSpeedlimits()
lanes = data_container.getLanes()
minimumSpeeds = data_container.getMiniumSpeeds()
roadObject = data_container.getRoadObject()
roadObject1 = data_container.getRoadObject1()
roadObjectList = data_container.getRoadObjectList()

#client.printList(roadObject, roadNames, speedLimits, lanes, minimumSpeeds)
#compare_objects.compare(roadObject,roadObject1)
compare1.compare1(roadObject,roadObject1,roadObjectList)


