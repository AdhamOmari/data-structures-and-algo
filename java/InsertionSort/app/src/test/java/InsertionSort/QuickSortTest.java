package InsertionSort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest {
    @Test
    public void testQuickSort() {
        int[] testArray1 = {8,10,20,1,3,4};
        int[] passArry = {1, 3, 4, 8, 10,20};
        assertArrayEquals(passArry, QuickSort.quickSort(testArray1));
        int[] testArray2 = {};
        int[] testArray2Sorted = {};
        assertArrayEquals(testArray2Sorted, QuickSort.quickSort(testArray2));
}
}
