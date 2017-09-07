package com.devschool.binary;

/**
 * Created by avinash.ranjan on 07/09/17.
 */
public class BinarySearch {

    public static int binarySearchWithRecursion(int arr[], int start, int end, int x) {
        if (end >= start) {
            int mid = start + (end - start) / 2;

            // If the element is present at the middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then it can only
            // be present in left subarray
            if (arr[mid] > x)
                return binarySearchWithRecursion(arr, start, mid - 1, x);

            // Else the element can only be present in right
            // subarray
            return binarySearchWithRecursion(arr, mid + 1, end, x);
        }

        // We reach here when element is not present in array
        return -1;
    }

    public int binarySearch(int[] inputArr, int key) {

        int start = 0;
        int end = inputArr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
