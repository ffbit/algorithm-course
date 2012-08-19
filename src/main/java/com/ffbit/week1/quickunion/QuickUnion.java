package com.ffbit.week1.quickunion;

import com.ffbit.week1.Find;

public class QuickUnion implements Find {

    private int[] relationHolder;

    public QuickUnion(int capacity) {
        relationHolder = new int[capacity];
        fillRelationHolder();
    }

    private void fillRelationHolder() {
        for (int i = 0; i < relationHolder.length; i++) {
            relationHolder[i] = i;
        }
    }

    @Override
    public boolean connected(int x, int y) {
        return getRootOf(x) == getRootOf(y);
    }

    private int getRootOf(int x) {
        if (x == relationHolder[x]) {
            return x;
        } else {
            return getRootOf(relationHolder[x]);
        }
    }

    @Override
    public void union(int x, int y) {
        relationHolder[getRootOf(y)] = getRootOf(x);
    }

}
