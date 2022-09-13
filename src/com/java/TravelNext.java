package com.java;

import java.util.HashMap;
import java.util.Map;

public class TravelNext {
    public static void main(String[] args) {
        Map<Integer, Integer> test = new HashMap<>();
        test.put(1,1);
        test.put(2,1);
        test.forEach((x,y) -> System.out.println("tomando llaves" + x));
        test.forEach((x,y) -> System.out.println("tomando valores" + y));

        }
    }

