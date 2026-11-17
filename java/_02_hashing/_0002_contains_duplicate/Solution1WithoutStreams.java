
package _02_hashing._0002_contains_duplicate;

import java.util.HashSet;
import java.util.Set;

/*
 * 0002 - Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/
 *
 * Given an integer array nums, return true if any value appears at least
 * twice; otherwise, return false.
 *
 * Examples:
 * [1, 2, 3, 1] -> true
 * [1, 2, 3, 4] -> false
 * [] -> false
 *
 * Approach: Add each number to a HashSet. Set.add returns false when the
 * value is already present, which means a duplicate has been found.
 *
 * Time: O(n) expected | Extra space: O(n)
 */
public class Solution1WithoutStreams {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();

        for (int number : nums) {
            if (!seen.add(number)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(
                new int[]{1, 2, 3, 1})); // true

        System.out.println(containsDuplicate(
                new int[]{1, 2, 3, 4})); // false

        System.out.println(containsDuplicate(
                new int[]{1, 1, 1, 3, 3, 4})); // true

        System.out.println(containsDuplicate(
                new int[]{})); // false
    }
}
