
"""
0003 - Valid Anagram
https://leetcode.com/problems/valid-anagram/

Given strings s and t, return True if t is an anagram of s. Anagrams contain
exactly the same characters with exactly the same frequencies, regardless of
order.

Examples: ("anagram", "nagaram") -> True; ("rat", "car") -> False

Approach: Count characters in s, then decrement those counts while scanning t.
Different lengths or a missing/exhausted character means they are not anagrams.

Time: O(n) expected | Extra space: O(k), k = distinct characters
"""


def is_anagram(s: str, t: str) -> bool:
    if len(s) != len(t):
        return False

    frequency = {}

    # Count characters in s.
    for ch in s:
        frequency[ch] = frequency.get(ch, 0) + 1

    # Subtract characters in t.
    for ch in t:
        count = frequency.get(ch, 0)

        if count == 0:
            return False

        frequency[ch] = count - 1

    return True


if __name__ == "__main__":
    print(is_anagram("anagram", "nagaram"))  # True
    print(is_anagram("rat", "car"))          # False
    print(is_anagram("aab", "abb"))          # False
    print(is_anagram("listen", "silent"))    # True
    print(is_anagram("", ""))               # True
