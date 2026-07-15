package dev.davidvelazquez.algorithms.searching;

/**
 * Utility class for the Linear Search algorithm.
 *
 * <p>Linear Search checks each element in an array until the target
 * value is found or the end of the array is reached.</p>
 */
public final class LinearSearch {

    /**
     * Utility class - no instances allowed.
     */
    private LinearSearch() {
    }

    /**
     * Performs a linear search on the given array.
     *
     * @param array  the array to search
     * @param target the value to search for
     * @return the index of the target, or -1 if it is not present
     */
    public static int search(int[] array, int target) {

        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null.");
        }

        // Iterate through the array until the target is found.
        for (int i = 0; i < array.length; i++) {

            if (array[i] == target) {
                return i;
            }

        }
        // Target was not found.
        return -1;
    }

}