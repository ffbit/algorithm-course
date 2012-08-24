package com.ffbit.week1.quickfind;

import com.ffbit.week1.Find;

public class QuickFind implements Find {

    private final int[] relationHolder;

    public QuickFind(final int capacity) {
        relationHolder = new int[capacity];

        fillRelationHolder();
    }

    @Override
    public boolean connected(final int x, final int y) {
        return relationHolder[x] == relationHolder[y];
    }

    @Override
    public void union(final int x, final int y) {
        for (int i = 0; i < relationHolder.length; i++) {
            if (relationHolder[y] == relationHolder[i]) {
                relationHolder[i] = relationHolder[x];
            }
        }
    }

    private void fillRelationHolder() {
        for (int i = 0; i < relationHolder.length; i++) {
            relationHolder[i] = i;
        }
    }

}
