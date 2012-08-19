package com.ffbit.week1.quickfind;

import com.ffbit.week1.Find;


public class QuickFind implements Find {

    private int[] relationHolder;

    public QuickFind(int capacity) {
        relationHolder = new int[capacity];

        fillRelationHolder();
    }

    @Override
    public boolean connected(int x, int y) {
        return relationHolder[x] == relationHolder[y];
    }

    @Override
    public void union(int x, int y) {
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
