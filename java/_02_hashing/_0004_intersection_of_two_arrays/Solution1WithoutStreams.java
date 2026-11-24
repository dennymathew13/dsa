
/*
 * LeetCode #349 - Intersection of Two Arrays
 * Difficulty: Easy
 * Pattern: Hashing / HashSet
 *
 * Question:
 * Given two integer arrays nums1 and nums2,
 * return their unique common elements.
 * The result can be returned in any order.
 *
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 *
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 *
 * https://leetcode.com/problems/intersection-of-two-arrays/
 */

package _02_hashing._0004_intersection_of_two_arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution1WithoutStreams {

    /*
     * Approach 1: HashSet + contains()
     * Expected Time: O(n + m)
     * Extra Space: O(min(n, m))
     */
    public static int[] intersection1(int[] nums1, int[] nums2) {

        int[] smaller = nums1.length <= nums2.length ? nums1 : nums2;

        int[] larger = nums1.length <= nums2.length ? nums2 : nums1;

        Set<Integer> seen = new HashSet<>();
        Set<Integer> common = new HashSet<>();

        for (int num : smaller) {
            seen.add(num);
        }

        for (int num : larger) {
            if (seen.contains(num)) {
                common.add(num);
            }
        }

        return toArray(common);
    }

    /*
     * Approach 2: HashSet + retainAll()
     * Expected Time: O(n + m)
     * Extra Space: O(n + m)
     */
    public static int[] intersection2(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        set1.retainAll(set2);

        return toArray(set1);
    }

    // Common utility: Convert Set<Integer> to int[].
    private static int[] toArray(Set<Integer> set) {

        int[] result = new int[set.size()];
        int index = 0;

        for (int num : set) {
            result[index++] = num;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        System.out.println("Approach 1 - contains(): "
                + Arrays.toString(intersection1(nums1, nums2)));

        System.out.println("Approach 2 - retainAll(): "
                + Arrays.toString(intersection2(nums1, nums2)));
    }
}
