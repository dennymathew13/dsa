package _02_hashing._0001_two_sum

/*
 * 0001 - Two Sum
 * https://leetcode.com/problems/two-sum/
 *
 * Given an integer array nums and a target,
 * return the indices of two numbers that add up to target.
 *
 * Input: nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]
 *
 * Time: O(n) expected | Space: O(n)
 */

fun twoSum(nums: IntArray, target: Int): IntArray {

    val seen = HashMap<Int, Int>()

    for (i in nums.indices) {

        val complement = target - nums[i]

        if (seen.containsKey(complement)) {
            return intArrayOf(seen.getValue(complement), i)
        }

        seen[nums[i]] = i
    }

    throw IllegalArgumentException("No solution found")
}

fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9

    println(twoSum(nums, target).contentToString())
}
