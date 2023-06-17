## Airline Ticket Price Calculator
This program calculates the price of an airplane ticket based on the distance and conditions provided by the user. The user is prompted to enter the distance (in kilometers), their age, and the type of travel (One Way or Round Trip). The program applies the following discounts based on specific conditions:

If the person is below 12 years old, a 50% discount is applied to the ticket price.
If the person is between 12 and 24 years old, a 10% discount is applied to the ticket price.
If the person is 65 years old or older, a 30% discount is applied to the ticket price.
If the person selects the Round Trip travel option, a 20% discount is applied to the ticket price.

# Prerequisites
Java Development Kit (JDK) installed on your machine
Java IDE or compiler to run the program

# Usage
Clone the repository or download the source code files.
Open the project in your Java IDE or compiler.
Compile and run the AirfareCalculator.java file.
Follow the program prompts to enter the distance, age, and travel type.
The program will calculate the total ticket price based on the given inputs and display it on the console.

# Example
Enter the distance in kilometers: 1500
Enter your age: 20
Enter the travel type (1 for One Way, 2 for Round Trip): 2

Total Price: 216.0 TL

# Error Handling
If the user enters invalid data (negative distance, negative age, or invalid travel type), the program will display the following error message: "Invalid input!"

# Notes
The ticket price is calculated at a rate of 0.10 TL per kilometer.
The program applies the discounts sequentially based on the given conditions.
All calculations are performed using double data type to maintain decimal accuracy.