import server
import client

fruits = server.getFruits()
adj = server.getAdjactives()

client.printList(fruits, adj)

