//------------------------------------------------------------------------------------------------------------------------
// Author   : Judith Morales Vidal
// Date     : 04-14-2025
// email    : jmoral58@students.solano.edu
// Class    : 10211
// Desc     : Implement two versions of binary search, one iterative and one recursive, to find numbers in a sorted array.
//            Also generate random numbers and use Java’s built-in binary search.
//----------------------------------------------------------------------------------------------------------------------
package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    // Iterative Binary Search
    public static int bs_itt(int [] arr, int key, int low, int high){
        while (low <= high){
            int mid = low + ((high - low) /2); // Find the middle index
            //found it 0 (1): FOUND Immediately
            if (arr[mid] == key){
                return mid; // Return position
            }
            // 0 (log n)
            if (key > arr[mid]){ // Search in the right half
                low = mid + 1;
            }
            // 0(log n)
            if (key < arr[mid]){ // Search int the left half
                high = mid - 1;
            }
        }
        return -1; // Not found
    }
    // Recursive Binary Search
    public static int bs_res(int [] arr, int key, int low,int high) {
        int mid = low + ((high - low) / 2);
        if (high < low) {
            return -1; // Not found
        }
        if (key == arr[mid]) {
            return mid; // Found
        } else if (key < arr[mid]) {
            return bs_res(arr, key, low, mid - 1); // Search left half
        } else {
            return bs_res(arr, key, mid + 1, high); // Search right half
        }
    }

    public static void main (String[] args) {
        Random r = new Random();
            int [] test2 = {0,0,0,0,0,0,0,0,0,0}; // Array with 10 elements
            for (short a = 0; a < test2.length; a++){
                test2[a] = r.nextInt(0, 10); // Fill with random numbers from 0 to 4
            }
            Arrays.sort(test2); // Sort the array
            int z = bs_itt(test2, 9, 0, test2.length-1); // Search for 9
            System.out.println("Pseudo Number: " + z);
            System.out.println("Random number WO sorting: " + z);
        }
    }

// Simple test array to trt searches
// int [] test = {1,3,5,7,9,100,300, 500, 1000};

// Testing recursive binary search with number not in array (68)
// int index1 = bs_res(test, 68, 0, test.length-1);
// System.out.println("Your index is: " + index1);

// Testing recursive binary search with number in array (100)
// int index2 = bs_res(test, 100,0, test.length-1);
// System.out.println("Your index with (recursion) is: " + index2);

// Testing Java built-in binary search for 1000
// int index3 = Arrays.binarySearch(test, 1000);
// System.out.println("Java Lib Bin Search : " + index3);
//}