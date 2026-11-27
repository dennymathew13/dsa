
/*
 * 0005 - Group Anagrams
 * https://leetcode.com/problems/group-anagrams/
 *
 * Given an array of strings strs, group the anagrams
 * together. The groups can be returned in any order.
 *
 * Example:
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
 *
 * Approach:
 * Sort the characters of each individual word.
 * Use the sorted word as the HashMap key.
 * Store the original words in a list as the value.
 *
 * Expected Time: O(n * k log k)
 * Space: O(n * k) including stored keys and result
 *
 * n = number of words
 * k = maximum word length
 */

package _02_hashing._0005_group_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1WithoutStreams {

    // Approach 1: Normal HashMap
    public static List<List<String>> groupAnagrams1(String[] strs) {

        Map<String, List<String>> groups = new HashMap<>();

        for (String word : strs) {

            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if (!groups.containsKey(key)) {
                groups.put(key, new ArrayList<>());
            }

            groups.get(key).add(word);
        }

        return new ArrayList<>(groups.values());
    }

    // Approach 2: Using computeIfAbsent()
    public static List<List<String>> groupAnagrams2(String[] strs) {

        Map<String, List<String>> groups = new HashMap<>();

        for (String word : strs) {

            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            groups.computeIfAbsent(key, k -> new ArrayList<>())
                    .add(word);
        }

        return new ArrayList<>(groups.values());
    }

    public static void main(String[] args) {

        String[] strs = {
                "eat", "tea", "tan",
                "ate", "nat", "bat"
        };

        System.out.println(groupAnagrams1(strs));
        System.out.println(groupAnagrams2(strs));
    }
}
