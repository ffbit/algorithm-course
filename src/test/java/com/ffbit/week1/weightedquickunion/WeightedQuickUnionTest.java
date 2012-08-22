package com.ffbit.week1.weightedquickunion;

import com.ffbit.week1.Find;
import com.ffbit.week1.find.FindTest;

public class WeightedQuickUnionTest extends FindTest {

    @Override
    public Find getFind(int capacity) {
        return new WeightedQuickUnion(capacity);
    }

}
