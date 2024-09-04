package bubble_sort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {

    @Test
    void testSort() {
        int[] unsortedArray = {5, 2, 8, 1, 9, 3};
        int[] expectedArray = {1, 2, 3, 5, 8, 9};

        BubbleSort.sort(unsortedArray);

        assertArrayEquals(expectedArray, unsortedArray);
    }

    @Test
    void testSortEmptyArray() {
        int[] emptyArray = {};
        int[] expectedArray = {};

        BubbleSort.sort(emptyArray);

        assertArrayEquals(expectedArray, emptyArray);
    }

    @Test
    void testSortAlreadySortedArray() {
        int[] sortedArray = {1, 2, 3, 4, 5};
        int[] expectedArray = {1, 2, 3, 4, 5};

        BubbleSort.sort(sortedArray);

        assertArrayEquals(expectedArray, sortedArray);
    }

    @Test
    void testSortWithNegativeNumbers() {
        int[] unsortedArray = {-5, 2, -8, 1, -9, 3};
        int[] expectedArray = {-9, -8, -5, 1, 2, 3};

        BubbleSort.sort(unsortedArray);

        assertArrayEquals(expectedArray, unsortedArray);
    }
}