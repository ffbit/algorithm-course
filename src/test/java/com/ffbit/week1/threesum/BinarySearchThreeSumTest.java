package com.ffbit.week1.threesum;

public class BinarySearchThreeSumTest extends ThreeSumTest {

    @Override
    public ThreeSum getThreSum() {
        return new BinarySearchThreeSum();
    }

}
