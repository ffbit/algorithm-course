package com.ffbit.week1.threesum;

import java.util.LinkedList;
import java.util.List;

public class BruteForceThreeSum implements ThreeSum {

    @Override
    public int[][] calculateTriplets(final int[] data) {
        final List<int[]> result = new LinkedList<int[]>();

        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                for (int k = j + 1; k < data.length; k++) {
                    if (data[i] + data[j] + data[k] != 0) {
                        continue;
                    }

                    result.add(new int[] { data[i], data[j], data[k] });
                }
            }
        }

        return result.toArray(new int[][] {});
    }
}
