
# 0003 — Valid Anagram

LeetCode: https://leetcode.com/problems/valid-anagram/
Difficulty: Easy
Topic: Hashing / Frequency Counting
Status: Guided solution — independent recall pending

## Problem

Given strings s and t, return true if t is an
anagram of s.

Anagrams contain exactly the same characters,
with exactly the same frequencies, regardless of order.

Examples:
- "anagram", "nagaram" -> true
- "rat", "car" -> false
- "aab", "abb" -> false
- "", "" -> true

## Core Insight

Having the same unique characters is not enough.
The frequency of each character must also match.

"aab" -> a:2, b:1
"abb" -> a:1, b:2

These are NOT anagrams.

## Approach 1 — HashMap

1. If lengths differ, return false.
2. Create a character-frequency HashMap.
3. Count every character in s.
4. Process each character in t.
5. If its remaining count is zero, return false.
6. Otherwise decrement the count.
7. If processing finishes, return true.

Important Java statement:

frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);

getOrDefault(ch, 0):
- Returns existing count if key exists.
- Otherwise returns zero.

## Why Does Decrementing Work?

For "aab" and "aba":

After s:
a:2, b:1

Process t:
a -> a:1, b:1
b -> a:1, b:0
a -> a:0, b:0

All characters matched.

Equal string lengths plus no invalid decrement
guarantee matching frequencies.

## Approach 2 — Java Streams

Convert characters to a stream, group identical
characters, and count occurrences.

Important APIs:
- String.chars()
- boxed()
- Collectors.groupingBy()
- Function.identity()
- Collectors.counting()
- Map.equals()

Compare the two resulting frequency maps.

## Complexity

Let n = string length and k = distinct characters.

HashMap approach:
- Time: O(n) expected
- Extra space: O(k)

Streams approach:
- Time: O(n) expected
- Extra space: O(k)

LeetCode #242 uses lowercase English letters,
so k <= 26 and auxiliary storage is bounded.

## Alternative Approaches

1. Sort both strings and compare.
   Time: O(n log n).

2. Use int[26] for lowercase English letters.
   Time: O(n).
   Extra space: O(1).

The int[26] approach is often preferred for this
problem because the character range is fixed.

## HashSet vs HashMap

Contains Duplicate:
- HashSet
- Only membership matters.

Valid Anagram:
- HashMap
- Character frequencies matter.

## Interview Follow-ups

1. Why is HashSet insufficient?
2. Why check string lengths first?
3. How does getOrDefault() work?
4. Why can we return false during decrementing?
5. How would int[26] replace HashMap?
6. What changes for arbitrary Unicode text?
7. What is the sorting alternative?

## Revision Checklist

- [ ] Explain anagram in my own words
- [ ] Write HashMap solution without notes
- [ ] Explain getOrDefault()
- [ ] Trace "aab" and "abb"
- [ ] Write Python solution independently
- [ ] Explain Java Streams approach
- [ ] Implement int[26] alternative
- [ ] Explain complexity
- [ ] Revisit after 1 day
- [ ] Revisit after 3 days
- [ ] Revisit after 7 days
