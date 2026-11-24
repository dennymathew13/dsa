
package _02_hashing._0004_intersection_of_two_arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution2WithStreams {

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> seen = Arrays.stream(nums1)
                .boxed()
                .collect(Collectors.toSet());

        return Arrays.stream(nums2)
                .filter(seen::contains)
                .distinct()
                .toArray();
    }

    public static void main(String[] args) {

        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};

        System.out.println(
                Arrays.toString(intersection(nums1, nums2))
        );
    }
}
