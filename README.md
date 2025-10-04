Project Status:

What is implemented:
The average is currently printed, and the time class is also fully implemented showing the time. The two main core algorithms Exponential distribution and Poisson Distribution have been implemented and are active in the program. Part of the Server class is working and is taking in a Queue of customers. The customers are counting their time and are leaving the store when they are done.

What is still needed:
The program will have to be adjusted a bit as the average is currently way too big. The program needs to simulate several days, not just one day and needs to increase the number of customers depending on the day. There needs to be multiple servers and customers need to go to a server depending on whether it will potentially be faster. It also needs to show how long they spend at checkout as well as how long they spent shopping.

What has changed:
Used an Arraylist to hold the customers, Big decimal to calculated the with massive values and scanner to take in user input. Also it is now takin in a historical wait, historical customer amount, and how long they normally spend at the store.

Installation Instructions:
1. Download Java version 24 to your IDE of choice.
2. Download the files and place them in a folder that your IDE of choice can see and run it from.

Usage:
1.Open main and its files in a IDE of your choice.
2. Run the main file in the IDE
3. Enter the historical customer amount, Wait time, and time spent in store shopping.
4. The simulation should start running and display the time, how many customers are entering at times, and the average at the end.

Architecture Overview:
The customer component deals with the customer and keeps track of the time the customer has spent in the store, when they arrived, when they left. The time component deals with the time in the store and keeps track of the hour, minute, and what day it is as well as how many customers may enter that day depending on what day it is. The server holds the customer at checkout and releases them when they finish checkout. The algorithm component holds both the exponential distribution and Poisson distribution algorithms.




