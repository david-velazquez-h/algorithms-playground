package dev.davidvelazquez.algorithms.searching;

public class BinarySearch {

    // Returns the index of the target, or -1 if not found
    // The array MUST be sorted first
    public static int search(int[] arr, int target) {
        // fail fast if array is null
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }

        int left = 0;
        int right = arr.length - 1;

        // keep looking while pointers don't cross
        while (left <= right) {

            // best way to get mid without integer overflow
            int mid = left + (right - left) / 2;

            // got it
            if (arr[mid] == target) {
                return mid;
            }

            // if target is bigger, search right half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // if target is smaller, search left half
            else {
                right = mid - 1;
            }
        }

        // not found
        return -1;
    }

}