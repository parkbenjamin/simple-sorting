/*
 * Class to generate sorted list of user-provided integers
 * @author Benjamin Park
 * @version 2.0.0
 * @since Week 5 of CSC6301
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.Stack;

public class StackFromUserInts {
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
     * finally store them in (and print) a stack.
     *
     * @param args      default parameter for a main function - not used here
     */
    public static void main(String[] args) {
        int[] arrayForStack = GetUserIntegers();
        Arrays.sort(arrayForStack);
        Stack<Integer> integerStack = new Stack<>();
        for (int i : arrayForStack) {
            integerStack.push(i);
        }
        System.out.println("Here is your stack of sorted integer values:");
        System.out.print("BOTTOM —> ");
        System.out.print(integerStack);
        System.out.printf(" <— TOP%n");
    }

}
