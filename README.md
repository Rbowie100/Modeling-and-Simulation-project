Project Status:
What is implemented: The average is currently printed, and the time class is also fully implemented showing the time. The two main core algorithms Exponential distribution and Poisson Distribution have been implemented and are active in the program. Part of the Server class is working and is taking in a Queue of customers. The customers are counting their time and are leaving the store when they are done.
What is still needed: The program will have to be adjusted a bit as the average is currently way too big. The program needs to simulate several days, not just one day and needs to increase the number of customers depending on the day. There needs to be multiple servers and customers need to go to a server depending on whether it will potentially be faster. It also needs to show how long they spend at checkout as well as how long they spend shopping.
What has changed: Used an Arraylist to hold the customers, Bigdecimal to calculate the massive values and scanner to take in user input. Also, it is now taking in a historical wait, historical customer amount, and how long they normally spend at the store.
Installation Instructions:
1.	Download Java version 24 to your IDE of choice.
2.	Download the files and place them in a folder so that IDE of choice can see and run it.
Usage:
1.	Open main and its files in an IDE of your choice.
2.	Run the main file in the IDE
3.	Enter the historical customer amount, Wait time, and time spent in store shopping.
4.	The simulation should start running and display the time, how many customers are entering at times, and the average at the end.
Architecture Overview: The customer component deals with the customer and keeps track of the time the customer has spent in the store, when they arrived, when they left. The time component deals with the time in the store and keeps track of the hour, minute, and what day it is as well as how many customers may enter that day depending on what day it is. The server holds the customer at checkout and releases them when they finish checkout. The algorithm component holds both the exponential distribution and Poisson distribution algorithms.
UML Design: It maps to the UML design by following a few of its methods, though quite a few have been removed, and it will be updated to reflect that.
Changes: some of the changes were making algorithm handle all of the math with exponential and Poisson to keep it simple and focused on that task. It also has several Poisson methods to consider customers entering at different time intervals and most of the other methods that were on the UML diagram were removed or remade to better fit the multiple interval idea. Customers had a few values and methods added to better keep track of how long the customer was in the store and at checkout and to pass that value to the exponential distribution to calculate if they can leave or not. It also has had a few Boolean values added to determine where the customer currently is, like whether they are at checkout or not. The time has had a few methods and variables added to better calculate the time and for the time to be more accurate when printing it out. Server has remained the same other than having a value to return the top customer.




