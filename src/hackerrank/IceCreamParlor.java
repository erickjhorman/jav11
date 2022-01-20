package hackerrank;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class IceCreamParlor {
    public static void main(String[] args) {
        Hashtable<Integer, Integer> flavors = new Hashtable<>();
        int[] array = {7, 2, 5, 4, 11};
        int money = 12;
        int key = 1;
        int sum = 0;
        boolean counter = false;
        for (int i = 0; i < array.length; i++) {
            flavors.put(key++, array[i]);
        }
        for (int j = 1; j < flavors.keySet().size() + 1; j++) {
            if (counter) {
                break;
            }
            int value = flavors.get(j);
            for (int k = 2; k < flavors.keySet().size() + 1; k++) {
                int secondValue = flavors.get(k);
                sum = value + secondValue;
                if (sum == money) {
                    System.out.println(k + " " + j);
                    counter = true;
                    break;
                }
            }
        }
    }

}
