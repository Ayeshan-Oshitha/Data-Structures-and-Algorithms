package Mosh.Arrays;

import java.util.Arrays;

class ArrayInJava {

    public static void main(String[] args) {
        
        // Creating an array of integers with a size of 5
        int[] numbers_1 = new int[5];

        // Printing the default values of the array
        System.out.println(Arrays.toString(numbers_1)); // Output: [0, 0, 0, 0, 0]

        // Initializing an array with values
        int[] numbers_2 = {1, 2, 3, 4, 5};

        // Printing the Length of the array
        System.out.println(numbers_2.length); // Output: 5
        
    }
}