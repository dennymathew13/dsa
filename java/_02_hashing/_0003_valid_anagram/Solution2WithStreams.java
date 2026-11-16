
package _02_hashing._0003_valid_anagram;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

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
