//-------------------------------------------------------------------------------------------------------
// Author   : Judith Morales Vidal
// Date     : 20250212
// email    : jmoral58@students.solano.edu
// Class    : 10211
// Desc     : Create a random password using ASCII values
//-------------------------------------------------------------------------------------------------------
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create scanner object to read input from the user
        Random random = new Random(); // Create random object to generate random numbers

        // Create an array of characters based on ASCII values (A-Z, a-z, 0-9)
        char[] characters = new char[62];

        // Uppercase letters A-Z (ASCII 65-90)
        for (int i = 0; i < 26; i++) {
            characters[i] = (char) (65 + i); // A-Z
        }

        // Lowercase letters a-z (ASCII 97-122)
        for (int i = 0; i < 26; i++) {
            characters[26 + i] = (char) (97 + i); // a-z
        }

        // Digits 0-9 (ASCII 48-57)
        for (int i = 0; i < 10; i++) {
            characters[52 + i] = (char) (48 + i); // 0-9
        }

        // Ask the user for the password length
        System.out.print("\nEnter password length (between 10 and 15): ");
        int length = scanner.nextInt(); // Get the password length from user input

        // Check if the length is between 10 and 15
        if (length < 10 || length > 15) {
            System.out.println("Password length must be between 10 and 15."); // If the length is invalid
            return;
        }

        char[] password = new char[length]; // Create an array to store the password characters

        // Generate a random character from the characters array for each position in the password
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length); // Get a random index from the characters array
            password[i] = characters[index]; // Assign the character at that index to the password array
        }

        // Print the generated password
        System.out.println("\n--------------------------------------------------");
        System.out.println("Your randomly generated password is: " + new String(password)); // Show password
        System.out.println("Password Length: " + length + " characters"); // Show the password length
        System.out.println("--------------------------------------------------");
    }
}
