
/*
 * 0005 - Group Anagrams
 * https://leetcode.com/problems/group-anagrams/
 *
 * Given an array of strings, group all anagrams together.
 *
 * Example:
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]
 *
 * Approach:
 * Sort each word and use it as the HashMap key.
 * Store the original words in a list.
 *
 * Expected Time: O(n * k log k)
 * Space: O(n * k) including stored keys and result
 */

fun groupAnagrams(strs: Array<String>): List<List<String>> {

    val groups = HashMap<String, MutableList<String>>()

    for (word in strs) {

        val key = word.toCharArray().sortedArray().concatToString()

        groups.getOrPut(key) { mutableListOf() }.add(word)
    }

    return groups.values.toList()
}

fun main() {

    val strs = arrayOf(
        "eat", "tea", "tan",
        "ate", "nat", "bat"
    )

    println(groupAnagrams(strs))
}
