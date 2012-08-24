package com.ffbit.week1.threesum;

import org.junit.Ignore;

@Ignore
public class BinarySearchThreeSumTest extends ThreeSumTest {

    @Override
    public ThreeSum getThreSum() {
        return new BinarySearchThreeSum();
    }

}
