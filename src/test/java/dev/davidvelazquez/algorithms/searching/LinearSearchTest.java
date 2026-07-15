package dev.davidvelazquez.algorithms.searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LinearSearchTest {

    @Test
    void shouldReturnCorrectIndex() {

        int[] numbers = {10, 20, 30, 40, 50};

        int result = LinearSearch.search(numbers, 30);

        assertEquals(2, result);

    }

    @Test
    void shouldReturnMinusOneWhenTargetDoesNotExist() {

        int[] numbers = {10, 20, 30};

        int result = LinearSearch.search(numbers, 100);

        assertEquals(-1, result);

    }

    @Test
    void shouldFindFirstElement() {

        int[] numbers = {10, 20, 30};

        int result = LinearSearch.search(numbers, 10);

        assertEquals(0, result);

    }

    @Test
    void shouldFindLastElement() {

        int[] numbers = {10, 20, 30};

        int result = LinearSearch.search(numbers, 30);

        assertEquals(2, result);

    }

    @Test
    void shouldReturnMinusOneForEmptyArray() {

        int[] numbers = {};

        int result = LinearSearch.search(numbers, 50);

        assertEquals(-1, result);

    }

    @Test
    void shouldThrowExceptionWhenArrayIsNull() {

        assertThrows(
                IllegalArgumentException.class,
                () -> LinearSearch.search(null, 10)
        );

    }

    @Test
    void shouldReturnFirstOccurrenceWhenArrayContainsDuplicates() {

        int[] numbers = {5, 10, 15, 10, 20};

        int result = LinearSearch.search(numbers, 10);

        assertEquals(1, result);

    }

}