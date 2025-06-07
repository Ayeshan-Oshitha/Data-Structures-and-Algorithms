package Mosh.Arrays;

import java.util.ArrayList;

public class DynamicArray {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Adding elements to the ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        // Displaying the ArrayList
        System.out.println(arrayList);

        // Size of the ArrayList
        System.out.println(arrayList.size()); 

        // Checking if the value 10 exists in the list and getting its index
        System.out.println(arrayList.indexOf(10));

        // Checking if an element exists in the ArrayList
        System.out.println(arrayList.contains(20));

        // Removing elements from the ArrayList 
        arrayList.remove(2);

        // Converts the ArrayList to a regular array of Objects
        arrayList.toArray();


    }

}
