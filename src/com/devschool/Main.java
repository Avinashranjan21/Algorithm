package com.devschool;

import com.devschool.linear.LinearSearch;

public class Main {

    public static void main(String[] args) {

//        Linear search on array

        int index = LinearSearch.searchInArray(9);
        if (index!=-1){
            System.out.println("Index of search string  = " +LinearSearch.searchInArray(9));
        }else {
            System.out.println("Entered value is not present in string");
        }
    }

}
