# Binary Search
## What is Binary Search?

Binary Search is a highly efficient searching algorithm used to find the position of a target value within a **sorted** array.

It works by repeatedly dividing the search interval in half. If the value of the target is less than the item in the middle of the interval, the search continues in the lower half. Otherwise, it continues in the upper half.

---

## Algorithm

1. Make sure the array is sorted (this is mandatory).
2. Set two pointers: `left` at the beginning and `right` at the end of the array.
3. Find the middle element (`mid`).
4. Compare the middle element with the target.
5. If it matches, return the index.
6. If the target is smaller, ignore the right half (`right = mid - 1`).
7. If the target is larger, ignore the left half (`left = mid + 1`).
8. Repeat until the pointers cross. If not found, return -1.

---

## Time Complexity

| Case | Complexity |
|------|------------|
| Best | O(1) |
| Average | O(log n) |
| Worst | O(log n) |

---

## Space Complexity

O(1)

The iterative approach uses a constant amount of extra memory.

---

## Advantages

- Extremely fast and efficient for large datasets.
- Scales incredibly well compared to linear search.

---

## Disadvantages

- The collection **must** be sorted beforehand.
- Slightly more complex to implement and prone to off-by-one errors.
- Not ideal for small arrays where the overhead of sorting might be worse than a linear search.

---

## Real-world examples

- Searching for a specific word in a physical dictionary.
- Looking up a user ID or record in a large, sorted database index.
- Finding the exact commit that introduced a bug in a version control system (like Git Bisect).

---

## What I Learned

Today I learned how important it is to ensure data is sorted before trying to optimize a search.

I also learned a great engineering trick: calculating the middle point using `left + (right - left) / 2` instead of `(left + right) / 2` to prevent integer overflow issues when dealing with massive arrays. It's a small detail, but crucial for building robust software.