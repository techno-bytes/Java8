package com.ashad.ocjp;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class ArraySearching {

    public static void main(String[] args) {


        int[] array = {2,8,7,65,23,111}; // 10, 1,5,7,8

        Arrays.sort(array);

        System.out.println(Arrays.binarySearch(array, 4));
        System.out.println(Arrays.binarySearch(array, 7));
        System.out.println(Arrays.binarySearch(array, 8));

        System.out.println(Arrays.binarySearch(array, 5));
        System.out.println(Arrays.binarySearch(array, 2));

        List<String> myList = List.of("sdad","dasds");
        String[] strings = myList.toArray(new String[10]);
        System.out.println(Arrays.toString(strings));


    }
}
