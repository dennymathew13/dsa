
/*
 * 0005 - Group Anagrams
 * https://leetcode.com/problems/group-anagrams/
 *
 * Given an array of strings, group all anagrams
 * together.
 *
 * Example:
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
 *
 * Approach:
 * Use Streams and Collectors.groupingBy().
 * Group words using their sorted characters as keys.
 *
 * Expected Time: O(n * k log k)
 * Space: O(n * k) including stored keys and result
 */

package _02_hashing._0005_group_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution2WithStreams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        return new ArrayList<>(
                Arrays.stream(strs)
                        .collect(Collectors.groupingBy(
                                word -> {
                                    char[] chars = word.toCharArray();
                                    Arrays.sort(chars);
                                    return new String(chars);
                                }
                        ))
                        .values()
        );
    }

    public static void main(String[] args) {

        String[] strs = {
                "eat", "tea", "tan",
                "ate", "nat", "bat"
        };

        System.out.println(groupAnagrams(strs));
    }
}
