package _02_hashing._0004_intersection_of_two_arrays

/*
 * 0004 - Intersection of Two Arrays
 * https://leetcode.com/problems/intersection-of-two-arrays/
 *
 * Given two integer arrays nums1 and nums2,
 * return their unique common elements.
 *
 * Example:
 * nums1 = [4, 9, 5]
 * nums2 = [9, 4, 9, 8, 4]
 * Output = [4, 9]
 *
 * Approach:
 * Convert both arrays into sets and find
 * their intersection.
 *
 * Time: O(n + m) expected
 * Extra Space: O(n + m)
 */

fun intersection(nums1: IntArray, nums2: IntArray): IntArray {

    val set1 = nums1.toSet()
    val set2 = nums2.toSet()

    return set1.intersect(set2).toIntArray()
}

fun main() {
    println(intersection(
        intArrayOf(4, 9, 5),
        intArrayOf(9, 4, 9, 8, 4)
    ).contentToString())

    println(intersection(
        intArrayOf(1, 2, 2, 1),
        intArrayOf(2, 2)
    ).contentToString())

    println(intersection(
        intArrayOf(1, 2),
        intArrayOf(3, 4)
    ).contentToString())
}
