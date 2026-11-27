
"""
0005 - Group Anagrams
https://leetcode.com/problems/group-anagrams/

Given an array of strings, group all anagrams together.

Example:
Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]]

Approach:
Sort each word and use the sorted word as a dictionary key.
Store the original words in a list.

Expected Time: O(n * k log k)
Space: O(n * k) including stored keys and result
"""


def group_anagrams(strs: list[str]) -> list[list[str]]:

    groups = {}

    for word in strs:

        key = "".join(sorted(word))

        if key not in groups:
            groups[key] = []

        groups[key].append(word)

    return list(groups.values())


if __name__ == "__main__":

    strs = ["eat", "tea", "tan", "ate", "nat", "bat"]

    print(group_anagrams(strs))
