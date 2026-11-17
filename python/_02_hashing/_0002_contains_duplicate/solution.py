
"""
0002 - Contains Duplicate
https://leetcode.com/problems/contains-duplicate/

Given an integer list nums, return True if any value appears at least twice;
otherwise, return False.

Examples: [1, 2, 3, 1] -> True; [1, 2, 3, 4] -> False; [] -> False

Approach: Keep visited values in a set and return True as soon as a value is
seen again.

Time: O(n) expected | Extra space: O(n)
"""


def contains_duplicate(nums: list[int]) -> bool:
    seen = set()

    for number in nums:
        if number in seen:
            return True

        seen.add(number)

    return False


if __name__ == "__main__":
    print(contains_duplicate([1, 2, 3, 1]))  # True
    print(contains_duplicate([1, 2, 3, 4]))  # False
    print(contains_duplicate([1, 1, 1, 3, 3, 4]))  # True
    print(contains_duplicate([]))             # False
