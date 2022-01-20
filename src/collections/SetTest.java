package collections;

import java.util.*;

public class SetTest {
    public static void main(String[] args) {
        // Set demonstration using HashSet
        Set<String> hash_Set = new HashSet<String>();

        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");

        //SortedSet<Integer> sortedSet = new HashSet<Integer>();
        SortedSet<String>   sortedSet1 = new TreeSet<>();

        System.out.println(hash_Set);

        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(
                new Integer[]{1, 3, 2, 4, 8, 9, 0}));
        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(
                new Integer[]{1, 3, 7, 5, 4, 0, 7, 5}));

        // To find union
        Set<Integer> union = new HashSet<Integer>(a);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);

        // To find intersection
        Set<Integer> intersection = new HashSet<Integer>(a);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

        // To find the symmetric difference
        Set<Integer> difference = new HashSet<Integer>(a);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);



    }
}
