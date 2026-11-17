"""
0001 - Two Sum
https://leetcode.com/problems/two-sum/

Given an integer list nums and an integer target, return the indices of two
different elements whose values add up to target.

Example: nums = [2, 7, 11, 15], target = 9 -> [0, 1]

Approach: Store number -> index in a dictionary. For every number, look for
target - number before storing the current value, which prevents reusing the
same index and handles duplicates such as [3, 3].

Time: O(n) | Extra space: O(n)
"""


def two_sum(nums: list[int], target: int) -> list[int]:
    seen: dict[int, int] = {}

    for index, number in enumerate(nums):
        complement = target - number

        if complement in seen:
            return [seen[complement], index]

        seen[number] = index

    raise ValueError("No two-sum solution exists")


if __name__ == "__main__":
    examples = [
        ([2, 7, 11, 15], 9),
        ([3, 2, 4], 6),
        ([3, 3], 6),
    ]

    for values, expected_target in examples:
        print(
            f"nums={values}, target={expected_target}"
            f" -> {two_sum(values, expected_target)}"
        )
