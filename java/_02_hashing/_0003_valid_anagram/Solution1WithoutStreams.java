
package _02_hashing._0003_valid_anagram;

import java.util.HashMap;
import java.util.Map;

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
