/*

Class: COP 2800: Java Programming
Instructor: Francis Fiskey
5.7 (Financial application: compute future tuition) Suppose that the tuition for a university is $10,000 this year and increases 5% every year.
In one year, the tuition will be $10,500.
Write a program that computes the tuition in ten years and the total cost of four years’ worth of tuition after the tenth year.
Due: Oct 13 by 11:59pm
I pledge by honor that I have completed the programming assignment independently.
I have not copied the code from a student or any source.
I have not given my code to any student.
Sign here:   
 ___Eric Snyder___

*/

public class Main { // Open the class block
  
    public static void main(String[] args) { // Open the main method block

        // Declare and initialize tuition variable
        int tuition = 10000; // We use this as a beginning value for tuition

        // Declare and initialize totalCost variable
        int totalCost = 0; // 

        // Now we loop through fourteen years to pull data
        for (int year = 1; year <= 14; year++) {

            // for each iteration we get receive the new value for what
            tuition += (tuition * 0.05); // tuition would be based on
                        // it's previous value with the 5% increase

            // Here is where we declare the value of tuition in 10 years
            if (year == 10) System.out.println("The tuition in year " + year + " is: $" + tuition);

            // This is where we start getting the costs of four years of
            // tuition after the tenth year
            if (year >= 11) { // Starting at year 11
                totalCost += tuition; // we add the tuition to the total cost
                // We initially set totalCost to 0 so we had a blank slate
            }
        }

        /* By collecting 4 years of addition after year ten we can print
        the total cost of four years of tuition after the tenth year */
        System.out.println("\nThe total cost for years 11-14 is: $" + totalCost);

    } // Close the main method block

} // Close the class block