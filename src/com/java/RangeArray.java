package com.java;

import java.util.*;
import java.util.stream.Collectors;

public class RangeArray {
    static Integer[] myArray = {2,3,1,0,7,6,2,1,3,0,8,5}; // 1,2,3 1,2,3,6,7 5,8
    static  int n = 12;
    static int count = 0;

    static void convertToString(List n){

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <n.size() ; i++) {
            stringBuilder.append(n.get(i));
        }
        if(n.size() > 0){
            stringBuilder.append(" ");
        }
        System.out.print(stringBuilder);

    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        int max = myArray[myArray.length - 1];
        for (int i = 0; i <myArray.length; i++) {
            numbers.add(myArray[i]);
            if(myArray[i] == 0){
                List<Integer> sortedOne = numbers.stream().sorted().collect(Collectors.toList());
                sortedOne.remove(0);
                convertToString(sortedOne);
                numbers.clear();
            }
        }
        for (int i = myArray.length - 1; i >=0 ; i--) {
            rightList.add(myArray[i]);
            if(myArray[i] == 0){
                List<Integer> sortedOne = rightList.stream().sorted().collect(Collectors.toList());
                sortedOne.remove(0);
                convertToString(sortedOne);
                numbers.clear();
                break;
            }
        }
    }
}
