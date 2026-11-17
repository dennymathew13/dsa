
package _02_hashing._0003_valid_anagram;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * 0003 - Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 *
 * Given strings s and t, return true if t is an anagram of s. Anagrams have
 * exactly the same characters with exactly the same frequencies, regardless
 * of order.
 *
 * Examples: ("anagram", "nagaram") -> true; ("rat", "car") -> false
 *
 * Approach: Build a character-frequency map for each string with streams and
 * compare the maps.
 *
 * Time: O(n) expected | Extra space: O(k), k = distinct characters
 */
public class Solution2WithStreams {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        return frequencies(s).equals(frequencies(t));
    }

    private static Map<Character, Long> frequencies(String str) {
        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")); // true
        System.out.println(isAnagram("rat", "car"));         // false
        System.out.println(isAnagram("aab", "abb"));         // false
        System.out.println(isAnagram("listen", "silent"));   // true
    }
}
