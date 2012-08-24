package com.ffbit.week1.threesum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BinarySearchThreeSum implements ThreeSum {

    @Override
    public int[][] calculateTriplets(int[] data) {
        List<int[]> result = new LinkedList<>();
        int[] sortedData = getSortedData(data);

        for (int i = 0; i < sortedData.length; i++) {
            for (int j = i + 1; j < sortedData.length; j++) {
                int sum = sortedData[i] + sortedData[j];
                int k = Arrays.binarySearch(sortedData, -sum);

                if (k >= 0) {
                    result.add(new int[] { sortedData[i], sortedData[j],
                            sortedData[k] });
                }
            }
        }
        
        System.out.println(Arrays.deepToString(result.toArray()));

        return result.toArray(new int[][] {});
    }

    private int[] getSortedData(int[] data) {
        int[] localData = Arrays.copyOf(data, data.length);
        Arrays.sort(localData);

        return localData;
    }

}
