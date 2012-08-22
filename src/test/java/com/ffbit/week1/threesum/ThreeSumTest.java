package com.ffbit.week1.threesum;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

public class ThreeSumTest {

    private BruteForceThreeSum threeSum;

    private int[] data;

    @Before
    public void setUp() throws Exception {
        threeSum = new BruteForceThreeSum();
        data = new int[] { 30, -40, -20, -10, 40, 0, 10, 5 };
    }

    @Test
    public void itShoulReturnRightTriplets() throws Exception {
        int[][] triplets = threeSum.calculateTriplets(data);

        int[][] expecteds = {
                { 30, -40, 10 },
                { 30, -20, -10 },
                { -40, 40, 0 },
                { -10, 0, 10 }
        };

        assertArrayEquals(expecteds, triplets);
    }

}
