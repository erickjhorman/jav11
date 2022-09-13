package com.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayTest {


    public static void main(String[] args) {
        List myList = new ArrayList<>();
        myList.add("hello");
        myList.add("Erick");
        List<Integer>  integerList =  new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        String[]  newArray = (String[]) myList.toArray(String[]::new);
        myList.stream().toArray(String[]::new); //another way to convert from list to array
        System.out.println(Arrays.toString(newArray));
        int[] array = integerList.stream().mapToInt(x ->  x).toArray();
        System.out.println(Arrays.toString(array));
    }
}
