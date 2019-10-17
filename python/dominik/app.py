import data_store
import client

types = data_store.getTypes()
colors = data_store.getColors()
origins = data_store.getOrigins()
produces = data_store.getProduces()
treeobject = data_store.getTreeObject()

client.printList(treeobject, types, colors, origins, produces)
