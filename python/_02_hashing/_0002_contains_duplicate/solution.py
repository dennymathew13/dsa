
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
