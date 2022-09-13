package com.java;

public class TheBottle {
    public static int emptyBottle(int ballsinbottle){
        if(ballsinbottle > 0){
            System.out.println(ballsinbottle);
            return emptyBottle(ballsinbottle - 1);
        } else {
            return ballsinbottle;
        }
    }


    public static void main(String[] args) {
        System.out.println(emptyBottle(emptyBottle(3)));
    }
}
