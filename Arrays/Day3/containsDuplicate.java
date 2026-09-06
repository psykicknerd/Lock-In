
package Arrays.Day3;

import java.util.HashSet;

public class containsDuplicate {

    // public static boolean containsDuplicate(int[] nums) {

    // for (int i = 0; i < nums.length; i++) {

    // for (int j = i + 1; j < nums.length; j++) {

    // if (nums[i] == nums[j]) {
    // return true;
    // }
    // }
    // }

    // return false;
    // }

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> hashset = new HashSet<>();

        for (int n : nums) {

            if (hashset.contains(n)) {
                return true;
            }

            hashset.add(n);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4 };

        System.out.println(containsDuplicate(nums));
    }
}