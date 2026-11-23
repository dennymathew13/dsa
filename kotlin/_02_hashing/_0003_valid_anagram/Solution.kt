
/*
 * 0003 - Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 *
 * Given two strings s and t, return true if t
 * is an anagram of s.
 *
 * Anagrams contain the same characters with
 * the same frequencies, regardless of order.
 *
 * Examples:
 * ("anagram", "nagaram") -> true
 * ("rat", "car") -> false
 *
 * Approach:
 * Count characters in s and decrement their
 * counts while iterating through t.
 *
 * Time: O(n) expected
 * Extra Space: O(k), k = distinct characters
 */

fun isAnagram(s: String, t: String): Boolean {

    if (s.length != t.length) {
        return false
    }

    val frequency = HashMap<Char, Int>()

    // Count characters in s.
    for (ch in s) {
        frequency[ch] = frequency.getOrDefault(ch, 0) + 1
    }

    // Subtract characters in t.
    for (ch in t) {
        val count = frequency.getOrDefault(ch, 0)

        if (count == 0) {
            return false
        }

        frequency[ch] = count - 1
    }

    return true
}

fun main() {
    println(isAnagram("anagram", "nagaram")) // true
    println(isAnagram("rat", "car"))         // false
    println(isAnagram("aab", "abb"))         // false
    println(isAnagram("listen", "silent"))   // true
    println(isAnagram("", ""))               // true
}
