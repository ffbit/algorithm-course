package com.ffbit.week1.threesum;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public abstract class ThreeSumTest {

    private ThreeSum threeSum;

    private int[] data;

    @Before
    public void setUp() throws Exception {
        threeSum = getThreSum();
        data = new int[] { 30, -40, -20, -10, 40, 0, 10, 5 };
    }

    @Test
    public void itShoulReturnRightTriplets() throws Exception {
        int[][] triplets = threeSum.calculateTriplets(data);

        assertThat(triplets.length, not(equalTo(0)));

        int[][] expecteds = {
                { 30, -40, 10 },
                { 30, -20, -10 },
                { -40, 40, 0 },
                { -10, 0, 10 }
        };

        assertArrayEquals(expecteds, triplets);
    }

    public abstract ThreeSum getThreSum();

}
