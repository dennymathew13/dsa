
package _02_hashing._0002_contains_duplicate;

import java.util.HashSet;
import java.util.Set;

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
