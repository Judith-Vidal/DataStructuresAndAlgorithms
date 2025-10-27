//------------------------------------------------------------------------------------------------------------------------------------------------
// Author   : Judith Morales Vidal
// Date     : 20250308
// email    : jmoral58@students.solano.edu
// Class    : 10211
// Desc     : Create a simple 10 element arraylist by prompting an user to enter 10 different numbers into each of the elements inside the arraylist.
//            Now, add 2 additional integer numbers into the existing arraylist.
// HC       : I will conduct myself with honor and integrity at all times.
//            I will not lie, cheat, or steal, nor will I accept the actions of those who do.
//------------------------------------------------------------------------------------------------------------------------------------------------
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Create an array called numberList to store 10 numbers entered by the user
        int[] numberList = new int[10];

        // Create another array called reverseNumberList to store 12 numbers (including the 2 additional ones)
        int[] reverseNumberList = new int[12];

        // Prompt the user to input 10 numbers
        System.out.println("Please, enter 10 numbers: ");

        for (int i = 0; i < 10; i ++ ) { // Loop to take 10 numbers from the user
            System.out.print(" Enter number " + (i + 1) + ": "); // Prompt the user for a number
            numberList[i] = userInput.nextInt(); // Store the number in the array
        }

        // Increase the size of numberList array to 12 while keeping its values
        numberList = Arrays.copyOf(numberList,12); //

        // Prompt the user to input 2 more numbers
        System.out.println("Now, please enter 2 more numbers: ");

        // // Loop to ask the user for 2 more numbers
        for (int i = 10; i < 12; i ++ ) { // Loop to take 2 more numbers from the user
            System.out.print("Enter number " + (i + 1) + ": "); // Prompt the user for a number
            numberList[i] = userInput.nextInt(); // Store the number in the array
        }

        // Print the 12 numbers in the list
        System.out.print("\nThe number in the list are: ");
        for (int num : numberList){
            System.out.print(num + " "); // Print each number from the list
        }

        System.out.println();

        // Reverse the order of the numbers in the array
        int j = 0; // Initialize a new counter for the reversed array

        System.out.print("\nThe numbers in reverse order are: ");
        for (int i = numberList.length - 1; i >= 0; i--) { // Loop through the array from the last to first
            reverseNumberList[j] = numberList[i]; // Store the numbers in reverse order
            j++; // Move to the next position in the reversed array
        }

        // Print the reversed array
        for (int i= 0; i <= reverseNumberList.length -1; i ++ ){ // Loop to print the reversed numbers
            System.out.print(reverseNumberList[i] + " ");

        }
    }
}
//______REFERENCE________
// Expanding the array using Arrays.copyOf, as described in "Data Structures & Algorithms"
// by Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser (Page 114).