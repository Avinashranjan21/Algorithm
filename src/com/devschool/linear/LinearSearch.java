package com.devschool.linear;

/**
 * Created by avinash.ranjan on 07/09/17.
 */
public class LinearSearch {


    public static int searchInArray(int searchInt){
        int linearArray[] = {12,14,55,45,65,75,55,98,89,78,9};
        for (int i = 0; i < linearArray.length; i++) {
            if (linearArray[i]==searchInt){
                return i;
            }
        }
        return -1;
    }
}
