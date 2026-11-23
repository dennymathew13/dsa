package _02_hashing._0002_contains_duplicate

/*
 * 0002 - Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/
 *
 * Given an integer array nums, return true if any
 * value appears at least twice; otherwise, return false.
 *
 * Examples:
 * [1, 2, 3, 1] -> true
 * [1, 2, 3, 4] -> false
 * [] -> false
 *
 * Approach: Use a HashSet to track visited numbers.
 *
 * Time: O(n) expected | Extra Space: O(n)
 */

fun containsDuplicate(nums: IntArray): Boolean {

    val seen = HashSet<Int>()

    for (number in nums) {
        if (!seen.add(number)) {
            return true
        }
    }

    return false
}

fun main() {
    println(containsDuplicate(intArrayOf(1, 2, 3, 1)))       // true
    println(containsDuplicate(intArrayOf(1, 2, 3, 4)))       // false
    println(containsDuplicate(intArrayOf(1, 1, 1, 3, 3, 4))) // true
    println(containsDuplicate(intArrayOf()))                 // false
}
