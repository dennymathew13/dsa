
package _02_hashing._0003_valid_anagram;

import java.util.HashMap;
import java.util.Map;

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
 * Approach: Count each character in s, then decrement its count while
 * scanning t. Different lengths or a missing/exhausted character means the
 * strings are not anagrams.
 *
 * Time: O(n) expected | Extra space: O(k), k = distinct characters
 */
public class Solution1WithoutStreams {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> frequency = new HashMap<>();

        // Count characters in the first string.
        for (char ch : s.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        // Reduce counts using the second string.
        for (char ch : t.toCharArray()) {

            int count = frequency.getOrDefault(ch, 0);

            if (count == 0) {
                return false;
            }

            frequency.put(ch, count - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")); // true
        System.out.println(isAnagram("rat", "car"));         // false
        System.out.println(isAnagram("aab", "abb"));         // false
        System.out.println(isAnagram("listen", "silent"));   // true
    }
}
