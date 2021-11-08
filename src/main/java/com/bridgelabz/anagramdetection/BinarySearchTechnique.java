package com.bridgelabz.anagramdetection;

/****************************************************************************
 * @author Pavani
 *
 * In this class implemented binary search technique.
 * checking against the array if given string is present or not.
 * using binary search technique. if present printing the appropriate message.
 ****************************************************************************/

public class BinarySearchTechnique {
    // Returns index of x if it is present in arr[],
    // else return -1
    private static<T extends Comparable<T>> int binarySearch(T[] arr, T x) {
        int lowerBand = 0, higherBand = arr.length - 1;
        while (lowerBand <= higherBand) {
            int middleBand = lowerBand + (higherBand - lowerBand) / 2;
            int result = x.compareTo(arr[middleBand]);

            // Check if findString is present at middleBand
            if (result == 0) {
                return middleBand;
            }
            // If result is greater, ignore left half
            if (result > 0) {
                lowerBand = middleBand + 1;
            }
            // If result is smaller, ignore right half
            else {
                higherBand = middleBand - 1;
            }
        }

        return -1;
    }

    // Driver method to test above
    public static void main(String []args) {
        String[] arr = {"Calm", "Good", "Hello", "Keep", "Pavani", "Night"};
        String findString = "Pavani";
        int result = binarySearch(arr, findString);

        if (result == -1) {
            System.out.println("Element not present");
        }
        else {
            System.out.println("Element found at " + "index " + result);
        }
    }
}