
# 0004 — Intersection of Two Arrays

LeetCode: https://leetcode.com/problems/intersection-of-two-arrays/
Difficulty: Easy
Pattern: Hashing / Set Intersection
Status: Guided practice — independent recall pending

## Problem

Return the unique elements common to two arrays.
Result order does not matter.

Example:
nums1 = [4, 9, 5]
nums2 = [9, 4, 9, 8, 4]
Output = [4, 9]

## Core Intuition

HashSet stores unique elements and provides
average O(1) membership checks.

## Approach 1 — HashSet

1. Convert both arrays into HashSets.
2. Use set1.retainAll(set2).
3. Convert the resulting set into int[].

## Java Collections APIs

containsAll() - Check whether all elements exist.
retainAll()   - Intersection.
addAll()      - Union.
removeAll()   - Difference.

retainAll() modifies the calling collection.
It returns true if the collection changed.

## Approach 2 — Streams

1. Convert nums1 into Set<Integer>.
2. Stream nums2.
3. Filter numbers present in the set.
4. Remove duplicates using distinct().
5. Convert the result into int[].

Important APIs:
- Arrays.stream()
- boxed()
- Collectors.toSet()
- filter()
- Method reference: seen::contains
- distinct()
- toArray()

## Python

list(set(nums1).intersection(set(nums2)))

Alternative:
list(set(nums1) & set(nums2))

## Complexity

Two HashSets:
- Expected time: O(n + m)
- Extra space: O(n + m)

Optimisation:
Store the smaller array in a HashSet.
Iterate over the larger array.
Remove matched elements to prevent duplicates.

- Expected time: O(n + m)
- Extra space: O(min(n, m))

## Edge Cases

- Empty intersection
- Duplicate elements
- Identical arrays
- Different array lengths
- Single-element arrays

## Interview Takeaway

HashSet tracks existence and uniqueness.
HashMap tracks key-value relationships.

Use HashSet when frequencies and indices
are not required.

## Revision

- [ ] Write Java solution independently
- [ ] Explain retainAll vs containsAll
- [ ] Explain Streams pipeline
- [ ] Write Python solution independently
- [ ] Explain smaller-array optimisation
- [ ] Revise after 1, 3 and 7 days
