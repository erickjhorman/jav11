package hackerrank;

import java.util.Arrays;

public class ArrayChallenge {
    public static void main(String[] args) {
        int n = 3;
        int[] myArray = {2, 4, 3};
        arrayChallenge(myArray);
    }

    private static int[] arrayChallenge(int[] nums) {
        int counter = 0;
        int[] result = new int[nums.length];
        result[0] = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            int j = i + 1, k = 0;
            while (i < j) {
                int num1 = nums[i];
                int num2 = nums[j];
                if (num1 < num2) {
                    int value = Math.abs(num2 - num1);
                    result[j] = value;
                }
            }
        }
        System.out.println(Arrays.toString(result));
        return null;
    }
}
