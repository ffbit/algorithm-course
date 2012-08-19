package com.ffbit.week1.quickfind;

import com.ffbit.week1.find.FindTest;

public class QuickFindTest extends FindTest {

    @Override
    public Find getFind(int capacity) {
        return new QuickFind(capacity);
    }

}
