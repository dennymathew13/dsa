
def intersection(nums1: list[int], nums2: list[int]) -> list[int]:

    set1 = set(nums1)
    set2 = set(nums2)

    return list(set1.intersection(set2))


if __name__ == "__main__":
    print(intersection([4, 9, 5], [9, 4, 9, 8, 4]))
    print(intersection([1, 2, 2, 1], [2, 2]))
    print(intersection([1, 2], [3, 4]))
