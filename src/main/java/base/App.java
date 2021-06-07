/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
package base;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/* Exercise 22 - Comparing Numbers
Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.

Write a program that asks for three numbers. Check first to see that all numbers are different. If they’re not
different, then exit the program. Otherwise, display the largest number of the three.

Example Output

Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.

Constraint

Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.

Challenges

Modify the program so that all entered values are tracked and the user is prevented from entering a number that’s
already been entered.
Modify the program so that it asks for ten numbers instead of three.
Modify the program so that it asks for an unlimited number of numbers.
*/
public class App 
{
    public static void main( String[] args )
    {
        int[] arr = new int[3];
        int biggestNumber = 0;
        Scanner number1 = new Scanner(System.in);
        Scanner number2 = new Scanner(System.in);
        Scanner number3 = new Scanner(System.in);

        //input first number
        System.out.print("Enter the first number: ");
        arr[0] =  number1.nextInt();

        //input second number
        System.out.print("Enter the first number: ");
        arr[1] =  number2.nextInt();

        //input first number
        System.out.print("Enter the first number: ");
        arr[2] =  number3.nextInt();

        // loops through array to find largest number
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > biggestNumber){
                biggestNumber = arr[i];
            }
        }

        //output
        System.out.println("The largest number is " + biggestNumber + ".");

    }

}
