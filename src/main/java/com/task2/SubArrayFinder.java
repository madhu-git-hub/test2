package com.task2;

public class SubArrayFinder {
	
	public static int findSubArrayIndex(int[] array, int[] subArray) {
        for (int i = 0; i <= array.length - subArray.length; i++) {
            int j;
            for (j = 0; j < subArray.length; j++) {
                if (array[i + j] != subArray[j]) {
                    break;
                }
            }
            if (j == subArray.length) {
                return i; // Return the sub-array index
            }
        }
        return -1; // Return -1 if the sub-array is not found
    }

    public static void main(String[] args) {
     
        int[] array = {4, 9, 3, 7, 8};
        int[] subArray = {3, 7};
        int index = findSubArrayIndex(array, subArray);
        System.out.println("Sub-array starts at index>> " + index);
    }
    
}
