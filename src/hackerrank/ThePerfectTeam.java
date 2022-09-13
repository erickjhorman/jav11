package hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class ThePerfectTeam {
    public static void main(String[] args) {
        System.out.println(differentTeams("mppzbmbpzcbmpbmczcz"));
    }

    /*
    private static int differentTeams(String s) {
        HashMap<Character, Integer> teams = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (teams.containsKey(a)) {
                teams.put(a, teams.get(a) + 1);
            } else {
                teams.put(a, 1);
            }
        }
        return teams.entrySet().stream().min(Comparator.comparing(Map.Entry::getValue)).get().getValue().intValue();
    }

     */

    private static int differentTeams(String s) {
        int min = 1;
        int j = 0;
        int tmp = 0;
        char[] c = s.toCharArray();
        String t = "";
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        for (int i = 0; i < c.length; i++) {
            if (i == c.length - 1) {
                break;
            }
            char a = c[i];
            for (int k = i + 1; k < c.length; k++) {
                if (a == c[k]) {
                    min++;
                    tmp = min;
                    //System.out.println("final count " + tmp);

                }
            }
            t += tmp;
            min = 1;
        }
        System.out.println(t);
        return 2;
    }
}
