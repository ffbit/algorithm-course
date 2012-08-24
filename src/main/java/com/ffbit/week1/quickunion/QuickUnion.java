package com.ffbit.week1.quickunion;

import com.ffbit.week1.Find;

public class QuickUnion implements Find {

    private final int[] relationHolder;

    public QuickUnion(final int capacity) {
        relationHolder = new int[capacity];
        fillRelationHolder();
    }

    private void fillRelationHolder() {
        for (int i = 0; i < relationHolder.length; i++) {
            relationHolder[i] = i;
        }
    }

    @Override
    public boolean connected(final int x, final int y) {
        return getRootOf(x) == getRootOf(y);
    }

    private int getRootOf(final int x) {
        int e = x;

        while (e != relationHolder[x]) {
            e = relationHolder[x];
        }

        return e;
    }

    @Override
    public void union(final int x, final int y) {
        relationHolder[getRootOf(y)] = getRootOf(x);
    }

}
