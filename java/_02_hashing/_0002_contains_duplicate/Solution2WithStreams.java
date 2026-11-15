
package _02_hashing._0002_contains_duplicate;

import java.util.Arrays;

public class Solution2WithStreams {

    public static boolean containsDuplicate(int[] nums) {
        return Arrays.stream(nums)
                .distinct()
                .count() != nums.length;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(
                new int[]{1, 2, 3, 1})); // true

        System.out.println(containsDuplicate(
                new int[]{1, 2, 3, 4})); // false

        System.out.println(containsDuplicate(
                new int[]{1, 1, 1, 3, 3, 4})); // true
    }
}
