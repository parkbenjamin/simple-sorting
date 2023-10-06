/*
 * Class to generate sorted list of user-provided integers
 * @author Benjamin Park
 * @version 1.0.0
 * @since Week 4 of CSC6301
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListFromUserInts {
    /**
     * Prompts the user for a list of integers and returns an (unsorted) array
     * with the values entered.
     * The user is prompted to separate integers by spaces, and the function
     * splits the entire string using the space as a delimiter.
     *
     * @return      an array of integers matching those entered by the user
     */
    public static int[] GetUserIntegers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of integers separated by spaces:");
        String[] userIntegers = sc.nextLine().split(" ");
        sc.close();  // Close the scanner (prevent memory leak)
        int[] intArray = new int[userIntegers.length];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.parseInt(userIntegers[i]);
        }
        return intArray;
    }

    /**
     * The main (driver) function of the program that will prompt the user for
     * a list of integers, sort the integers from smallest to largest, and
     * finally store them in (and print) a linked list.
     *
     * @param args      default parameter for a main function - not used here
     */
    public static void main(String[] args) {
        int[] arrayForLinkedList = GetUserIntegers();
        Arrays.sort(arrayForLinkedList);
        LinkedList<Integer> integerLL = new LinkedList<>();
        for (int i : arrayForLinkedList) {
            integerLL.add(i);
        }
        System.out.println("Here is your linked list of sorted values:");
        System.out.println(integerLL);
    }

}
