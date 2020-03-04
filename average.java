/*
Name:- Raju Khadka
CS2365-001
Part 1

Displays the largest number,smallest number,sum of number, and average of the numbers asked from the user 
*/

import java.util.Scanner; //importing Scanner for taking the inputs from users

//creating class
public class average {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // creating a Scanner variable called input to get the integers from
                                                // user
        System.out.println("Please Enter the values :"); // creates output

        int intArray[]; // initilizing the array
        intArray = new int[4]; // size of array

        // initilizing the integers
        int Sum = 0;
        int i;
        for (i = 0; i < 4; i++) // creating for loop to make an array from user inputs
        {

            intArray[i] = input.nextInt();
            Sum += intArray[i]; // Add all the inputs and create a Sum

        }
        System.out.println(" The Values You Entered Are: ");

        for (i = 0; i < 4; i++) // for loop to output the numbers entered by user
        {
            System.out.println(intArray[i]);
        }
        // initilizing for min and max value
        double min = intArray[0];
        double max = intArray[0];
        for (i = 1; i < 4; i++) // for loop to compare the numbers and find minimum and maximum numbers
        {
            if (intArray[i] < min) // if statement to compare arrays inorder to find minimum number
            {
                min = intArray[i];
            }
            if (intArray[i] > max) // if statement to compare arrays inorder to find maximum number
            {
                max = intArray[i];
            }
        }

        double Average = (double) Sum / intArray.length; // finding average

        // displays output largest and smallest number and sum and average of the
        // elements of array
        System.out.println("Largest Number = " + max);
        System.out.println("Smallest Number =" + min);
        System.out.println("Sum of the numbers =" + Sum);
        System.out.println("Average of the numbers =" + Average);
        input.close();
    }
}