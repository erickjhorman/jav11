import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class test {

    public static void main(String[] args) {
        int[][] myArray = {{1,2,3,4,5,6},
                          {1,2,3,4,5,6}

        };

        for (int row = 0; row <myArray.length ; row++) {
            for (int column = 0; column < myArray[row].length ; column++) {
                System.out.print(myArray[row][column]);
            }
            System.out.println();
        }

        Hashtable<Integer,String> magazineTable =  new Hashtable<Integer,String>();
        Hashtable<Integer,String> noteTable =  new Hashtable<Integer,String>();



        Set common = new HashSet(magazineTable.entrySet());

/*
        int prices[] = {1,2,3,4};
        int k = 7;
*/

        int prices[] = {1, 12, 5, 111, 200 ,1000 ,10};


        int k = 50;

/*
        int prices[] = {3 ,7, 2 ,9 ,4};
        int k = 15;
*/

        /*
        int[] sortedArray = Arrays.stream(prices)
                .sorted().toArray();
        System.out.println(Arrays.toString(sortedArray));
        int maximum = 0;
        int sum = 0;

        for(int i = 0; i <sortedArray.length;i++){
            int current = sortedArray[i];
            System.out.println("i" + current);
            sum += current;
            System.out.println("suma" + sum);
            if(sum>k){
                maximum =  i;
                break;
            }
        }
*/

        //System.out.println(sum);
        //System.out.println(maximum);
        /*
        int[] numbers = {2,3,4,2,3,6,8,4,5};
        int[] sorted =  Arrays.stream(numbers).sorted().toArray();
        int start = 0;
        int end = 5;
        int[] slice = new int[end - start];

        for (int i = 0; i <slice.length ; i++) {
            slice[i] = sorted[start + i];
        }
        System.out.println(Arrays.toString(slice));

        int m = 0;
        int n = slice.length;
        if(n%2 == 1){
            m=slice[(n+ 1)/2-1];
        } else {
            m = (slice[n/2-1] + slice[n/2])/2;
        }
        System.out.println("median :" + m);
*/
       int[] arr = {1, 1, 1, 2, 2};
       int length = arr.length;
       //0 to 4
        for (int i = 0; i < length-1; i++) {
            System.out.println("i :  " + i + arr[i]);
        }
    }
}
