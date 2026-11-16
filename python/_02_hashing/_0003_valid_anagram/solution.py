
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
