package Arrays.Day1;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String args[]) {
        int[] arr = { 22, 14, 8, 17, 35, 3 };
        int temp = 0;
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
