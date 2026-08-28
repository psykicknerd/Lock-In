package Arrays.Day1;

import java.util.*;

public class MaximumAndMinimumInArray {
    public static void main(String args[]) {
        int[] arr = { 22, 14, 8, 17, 35, 3 };

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int[] result = { min, max };
        System.out.println(Arrays.toString(result));
    }
}