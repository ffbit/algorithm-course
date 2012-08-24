package com.ffbit.week1.threesum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BinarySearchThreeSum implements ThreeSum {

    @Override
    public int[][] calculateTriplets(final int[] data) {
        final List<int[]> result = new LinkedList<int[]>();
        final int[] sortedData = getSortedData(data);

        for (int i = 0; i < sortedData.length; i++) {
            for (int j = i + 1; j < sortedData.length; j++) {
                final int sum = sortedData[i] + sortedData[j];
                final int k = Arrays.binarySearch(sortedData, -sum);

                if (k >= 0) {
                    result.add(new int[] { sortedData[i], sortedData[j],
                            sortedData[k] });
                }
            }
        }

        return result.toArray(new int[][] {});
    }

    private int[] getSortedData(final int[] data) {
        final int[] localData = Arrays.copyOf(data, data.length);
        Arrays.sort(localData);

        return localData;
    }

}
