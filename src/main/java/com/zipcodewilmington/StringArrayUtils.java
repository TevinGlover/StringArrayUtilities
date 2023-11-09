package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int lastElement = array.length - 1; // length of the array minus length by one due to off set
        return array[lastElement];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int lastSecondElement = array.length - 2; //array.length -2
        return array[lastSecondElement]; // need the arr[] with the number inside


        // return null;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        boolean result = false;// setting the boolean to false

        for (int i = 0; i <= array.length - 1; i++) {
            // using a for loop ro run throught a for loop to check the value of i
            if (array[i] == value) {
                // checks the value i==value
                result = true;
                // if found return result to true
            }

        }

        return result;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {


        ArrayList yarra = new ArrayList();

        // split the array
        for (int i = array.length - 1; i >= 0; i--) {// for loop in reverse
            // add (append) the elements to a new array
            yarra.add(array[i]);
            // return new array set up.
        }
        /**   String [] backWords = new String[yarra.size()];// turning the size of the Str to the same size of Arr
         for(int i =0; i<= array.length -1; i++){// add it object to the string arr
         backWords[i] = yarra.get(i).toString();
         //System.out.println(backWords[i]);// this shows that all object are going in backwards
         }
         */
        //  return backWords;
        return (String[]) yarra.toArray(new String[yarra.size()]); // the one liner + for loop
        // this takes in the to array method and cast it to a string aging.

        //return null;
    }


    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        // reverse array
        String[] reversed = reverse(array);

        // iterate through both arrays in parallel
        for (int i = 0; i < reversed.length; i++) {
            // check ith element in the reversed array
            String currentElementReversed = reversed[i];

            // check ith element in the input array
            String currentElement = array[i];

            // check if elements are identical
            boolean isIdentical = currentElementReversed.equals(currentElement);

            // if the are not identical
            if(!isIdentical) {

                // this is non-palindromic
                return false;
            }
        }
        // if we complete the loop without ever returning false (as declared on line 121),
        // then clearly we return true;
        return true; //p.s leon is a goat.
    }








    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        char[] letter = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        // create a list to compare the array with.
        // if element all element matches the elements in the array then return true.
        for (int i = 0; i < array.length; i++) {
            // if array contain all of letter

            // check the element in the input array
            String element = array[i];

            // check if the array is contained all elements between a -z,
            boolean isAtoZ = element.contains("abcdefghijklmnopqrstuvwxyz");
            if (isAtoZ) {

              return false;


            } else if (letter.equals(element)) {
                return true;

            }

        }
        return true;
    }
    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        return 0;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
