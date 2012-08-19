package com.ffbit.week1.quickunion;

import com.ffbit.week1.Find;
import com.ffbit.week1.find.FindTest;

public class QuickUnionTest extends FindTest {

    @Override
    public Find getFind(int capacity) {
        return new QuickUnion(capacity);
    }

}
