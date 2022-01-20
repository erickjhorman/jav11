package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class D2ArrayDS {

    public static void main(String[] args) {

        List<List<Integer>> test = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        List<Integer> finalSum = new ArrayList<>();
        Integer sum = 0;
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        test.add(0, list1);
        test.add(1, list2);



        for (Integer i = 0; i < test.size(); i++) {
            
            List<Integer> tmp = test.get(i);
            //System.out.println(tmp.toString());
            for (Integer k = 0; k < tmp.size() - 1; k++) {
                List<Integer> tmp2 = test.get(k);
                sum =  tmp2.stream().reduce(0, Integer::sum);
                //System.out.println(tmp.toString());
                //System.out.println(sum);
                finalSum.add(sum);

                //System.out.println(sum);
            }
            System.out.println(finalSum.toString());
            //Integer sum = test.get(i).stream().reduce(0, Integer::sum);
            //System.out.println(sum);
        }


    }
}
