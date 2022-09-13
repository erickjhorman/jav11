package hackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RiverRecord {
    public static void main(String[] args) {
        System.out.println(maxTrailing(Arrays.asList(4,3,2,1)));
    }
    public static int maxTrailing(List<Integer> levels) {
        Set<Integer> maxTrailingRecords = new HashSet<>();
        int i = 1;
        int j = 0;
        while(levels.size() > i) {
            int current = levels.get(i);
            while(current > levels.get(j)){
                maxTrailingRecords.add(current - levels.get(j));
                j--;
                if(j < 0){
                    break;
                }
            }
            i++;
            j = i - 1;
        }
        if(maxTrailingRecords.isEmpty()) return -1;
        return maxTrailingRecords.stream().reduce(0,Integer::max);
    }

    /*
    public static int maxTrailing(List<Integer> levels) {
        Set<Integer> maxTrailingRecords = new HashSet<>();
        int i = 1;
        int j = i - 1;
        while(levels.size() > i) {
            int current = levels.get(i);
            while(current > levels.get(j)){
                maxTrailingRecords.add(current - levels.get(j));
                j--;
                if(j < 0) break;
            }
            i++;
            j = i - 1;
        }
        if(maxTrailingRecords.isEmpty()) return -1;

        return maxTrailingRecords.stream().reduce(Integer::max).orElse(0);
    }

     */

}

