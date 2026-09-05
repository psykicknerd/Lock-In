package Arrays.Day2;

public class MaxSubarray {
    public static void main(String[] args) {
        int[] arr = { -2, 1 };

        // int sum = Integer.MIN_VALUE;
        // int temp;

        // for (int i = 0; i < arr.length; i++) {
        // temp = 0;
        // for (int j = i; j < arr.length; j++) {

        // // for (int k = i; k <= j; k++) {
        // temp = temp + arr[j];
        // // }
        // if (temp > sum) {
        // sum = temp;
        // }
        // }
        // }
        // System.out.println(sum);

        int sum = Integer.MIN_VALUE;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            temp = temp + arr[i];
            if (temp > sum) {
                sum = temp;
            }
            if (temp < 0) {
                temp = 0;
            }
        }
        System.out.println(sum);
    }
}
