
# 0002 — Contains Duplicate

LeetCode: https://leetcode.com/problems/contains-duplicate/

Difficulty: Easy
Category: Hashing
Status: Solution provided; independent practice pending.

## Problem

Given an integer array nums, return true if any
number appears more than once. Otherwise return false.

## Examples

Input:  [1, 2, 3, 1]
Output: true

Input:  [1, 2, 3, 4]
Output: false

Input:  []
Output: false

## Approach 1 — HashSet

1. Create an empty HashSet.
2. Visit each number.
3. Try to add the number to the set.
4. If add() returns false, a duplicate exists.
5. Return true immediately.
6. If the loop finishes, return false.

Key Java statement:

    if (!seen.add(number)) return true;

## Approach 2 — Java Streams

Convert the array into a stream.
Keep distinct elements.
Count them.
Compare the count with the original array length.

    Arrays.stream(nums).distinct().count() != nums.length

## Complexity

HashSet:
- Time: O(n) expected
- Extra space: O(n)

Streams with distinct():
- Time: O(n) expected for this sequential hash-based approach
- Extra space: O(n)

## What I Learned

HashMap:
Stores key-value pairs.
Example: number -> index

HashSet:
Stores unique values.

HashSet.add():
- true: newly added
- false: already present

Streams:
- Arrays.stream(): creates a stream
- distinct(): removes duplicates
- count(): counts elements

## Interview Follow-ups

1. Why use HashSet instead of HashMap?
2. What does HashSet.add() return?
3. Can we solve this without extra space?
4. How would sorting change the complexity?
5. What is the difference between distinct() and filter()?

## Revision Checklist

- [ ] Explain the approach without notes
- [ ] Write the Java solution independently
- [ ] Write the Python solution independently
- [ ] Explain time and space complexity
- [ ] Explain the Streams solution
- [ ] Solve again after 1 day
- [ ] Solve again after 3 days
- [ ] Solve again after 7 days
