package com.ffbit.week1.binarysearch;

public class BinarySearch {

    public int search(final int[] input, final int needle) {
        int start = 0;
        int end = input.length - 1;

        while (start <= end) {
            final int middle = start + (end - start) / 2;

            if (input[middle] == needle) {
                return middle;
            } else if (input[middle] < needle) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return -1 - start;
    }
}
