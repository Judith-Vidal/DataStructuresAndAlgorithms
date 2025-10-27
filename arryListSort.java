//------------------------------------------------------------------------------------------------------------------------------------------------
// Author   : Judith Morales Vidal
// Date     : 20250529
// email    : jmoral58@students.solano.edu
// Class    : 10211
// Desc     : Write a function called shuffle.
// HC       : I will conduct myself with honor and integrity at all times.
//            I will not lie, cheat, or steal, nor will I accept the actions of those who do.
//------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void shuffle (ArrayList<Integer> arraySuffle){

        //Declare random variable
        Random rand = new Random();

        for (int i = 0; i < arraySuffle.size(); i ++){
          int i_random = rand.nextInt(arraySuffle.size());
          int  i_randomValue = arraySuffle.get(i_random);
          int i_Value = arraySuffle.get(i);
          arraySuffle.set(i_random, i_Value);
          arraySuffle.set(i, i_randomValue);
        }
    }

    public static void ascendingSort(ArrayList<Integer> arrayNumbers){
        // Sorting the arrylist with insertion method
        int arrayLength = arrayNumbers.size();
        for (int i = 1; i<arrayLength; i++){
            int value = arrayNumbers.get(i);
            int j = i;
            while (j > 0 && arrayNumbers.get(j-1) > value){
                arrayNumbers.set (j, arrayNumbers.get(j-1));
                j --;
            }
            arrayNumbers.set (j,value);
        }
    }

    public static void main(String[] args) {

        // Declare the arrylist and Random variable
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        Random rand = new Random();

        // Generate 20 integer psedo random numbers
        for (int i = 0; i < 20; i++){
            numberList.add(rand.nextInt(1000 -10) + 10);
        }

        System.out.println("\nPseudo random numbers");

        // Printout the 20 psedo random numbers
        for (Integer a : numberList){
            System.out.println(a);
        }
        System.out.println("\nAscending order numbers");

        // Sort in ascending order
       ascendingSort(numberList);

        // Printout the sorted pseudo random numbers
        for (Integer b : numberList){
            System.out.println(b);
        }

        // Shuffle the arraylist
        shuffle(numberList);

        System.out.println("\nShuffle numbers");

        // Printout the shuffle arraylist
        for (Integer c : numberList){
            System.out.println(c);
        }
    }
}