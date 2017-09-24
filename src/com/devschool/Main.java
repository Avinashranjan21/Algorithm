package com.devschool;

import com.devschool.searching_algo.binary.BinarySearch;
import com.devschool.searching_algo.linear.LinearSearch;

public class Main {

    public static void main(String[] args) {

        linearSearch();
        binarySearch();
    }

    private static void linearSearch() {
//      Linear search on array

        int index = LinearSearch.searchInArray(9);
        if (index != -1) {
            System.out.println("Index of search string  = " + LinearSearch.searchInArray(9));
        } else {
            System.out.println("Entered value is not present in array");
        }
    }


    private static void binarySearch() {
//      Binary search always work on sorted array.
        BinarySearch ob = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};
        int x = 10;
        int result = ob.binarySearch(arr,x);
        if (result == -1) {
            System.out.println("Element not present");
        }
        else {
            System.out.println("Element found at index using binary search  " + result);
        }
    }

}
