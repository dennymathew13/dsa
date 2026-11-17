package _02_hashing._0001_two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * 0001 - Two Sum
 * https://leetcode.com/problems/two-sum/
 *
 * Given an integer array nums and an integer target, return the indices of
 * two different elements whose values add up to target.
 *
 * Example: nums = [2, 7, 11, 15], target = 9 -> [0, 1]
 *
 * Approach: While scanning the array, store number -> index in a HashMap.
 * For each number, first look for target - number so the same index is never
 * used twice. This also handles duplicates such as [3, 3].
 *
 * Time: O(n) | Extra space: O(n)
 */
public class Solution1WithoutStreams {

    public static int[] twoSum(int[] nums, int target) {

        // Remember each number and its index.
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            // What number do we need to reach the target?
            int needed = target - nums[i];

            // Have we already encountered that number?
            if (seen.containsKey(needed)) {
                return new int[]{seen.get(needed), i};
            }

            // Otherwise, remember this number.
            seen.put(nums[i], i);
        }

        throw new IllegalArgumentException("No pair found");
    }

    public static void main(String[] args) {

        test(new int[]{2, 7, 11, 15}, 9);
        test(new int[]{3, 2, 4}, 6);
        test(new int[]{3, 3}, 6);
    }

    private static void test(int[] nums, int target) {
        System.out.println(
            Arrays.toString(twoSum(nums, target))
        );
    }
}
