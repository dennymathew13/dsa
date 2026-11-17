
package _02_hashing._0002_contains_duplicate;

import java.util.Arrays;

/*
 * 0002 - Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/
 *
 * Given an integer array nums, return true if any value appears at least
 * twice; otherwise, return false.
 *
 * Examples: [1, 2, 3, 1] -> true; [1, 2, 3, 4] -> false; [] -> false
 *
 * Approach: Remove repeated values with distinct(). If fewer values remain
 * than the original array length, the input contained a duplicate.
 *
 * Time: O(n) expected | Extra space: O(n)
 */
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
