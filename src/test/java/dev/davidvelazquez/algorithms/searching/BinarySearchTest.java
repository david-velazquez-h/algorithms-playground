package dev.davidvelazquez.algorithms.searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BinarySearchTest {

    @Test
    void shouldReturnCorrectIndex() {

        int[] numbers = {10, 20, 30, 40, 50}; // must be sorted

        int result = BinarySearch.search(numbers, 30);

        assertEquals(2, result);

    }

    @Test
    void shouldReturnMinusOneWhenTargetDoesNotExist() {

        int[] numbers = {10, 20, 30};

        int result = BinarySearch.search(numbers, 100);

        assertEquals(-1, result);

    }

    @Test
    void shouldFindFirstElement() {

        int[] numbers = {10, 20, 30, 40, 50};

        int result = BinarySearch.search(numbers, 10);

        assertEquals(0, result);

    }

    @Test
    void shouldFindLastElement() {

        int[] numbers = {10, 20, 30, 40, 50};

        int result = BinarySearch.search(numbers, 50);

        assertEquals(4, result);

    }

    @Test
    void shouldReturnMinusOneForEmptyArray() {

        int[] numbers = {};

        int result = BinarySearch.search(numbers, 50);

        assertEquals(-1, result);

    }

    @Test
    void shouldThrowExceptionWhenArrayIsNull() {

        assertThrows(
                IllegalArgumentException.class,
                () -> BinarySearch.search(null, 10)
        );

    }

}