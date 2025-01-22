package com.task2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SubArrayFinderTest {
	@Test
    public void testFindSubArrayIndex_LargerArray() {
        // Test case where the sub-array is at the end of a larger array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] subArray = {7, 8, 9};
        int result = SubArrayFinder.findSubArrayIndex(array, subArray);
        assertEquals(6, result, "Sub-array should start at index 6");
    }

    @Test
    public void testFindSubArrayIndex_SingleElement() {
        // Test case where both the array and sub-array have only one element
        int[] array = {5};
        int[] subArr = {5};
        int result = SubArrayFinder.findSubArrayIndex(array, subArr);
        assertEquals(0, result, "Sub-array should be found at index 0");
    }

    @Test
    public void testFindSubArrayIndex_SubArrayLargerThanArray() {
        // Test case where the sub-array is larger than the array
        int[] array = {1, 2, 3};
        int[] subArray = {1, 2, 3, 4};
        int result = SubArrayFinder.findSubArrayIndex(array, subArray);
        assertEquals(-1, result, "Sub-array cannot be larger than the array, should return -1");
    }

    @Test
    public void testFindSubArrayIndex_Found() {
        // Test case where the sub-array is found in the array
        int[] array = {4, 9, 3, 7, 8};
        int[] subArray = {3, 7};
        int result = SubArrayFinder.findSubArrayIndex(array, subArray);
        assertEquals(2, result, "Sub-array should start at index 2");
    }

    @Test
    public void testFindSubArrayIndex_NotFound() {
        // Test case where the sub-array is not found in the array
        int[] array = {4, 9, 3, 7, 8};
        int[] subArray = {7, 8, 9};
        int result = SubArrayFinder.findSubArrayIndex(array, subArray);
        assertEquals(-1, result, "Sub-array should not be found, should return -1");
    }

    @Test
    public void testFindSubArrayIndex_EmptyArray() {
        // Test case where the array is empty
        int[] array = {};
        int[] subArray = {1, 2};
        int result = SubArrayFinder.findSubArrayIndex(array, subArray);
        assertEquals(-1, result, "Sub-array should not be found in an empty array");
    }

    @Test
    public void testFindSubArrayIndex_EmptySubArray() {
        // Test case where the sub-array is empty
        int[] array = {1, 2, 3, 4};
        int[] subArray = {};
        int result = SubArrayFinder.findSubArrayIndex(array, subArray);
        assertEquals(0, result, "An empty sub-array should be found at index 0");
    }

    
}
