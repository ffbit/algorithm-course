package com.ffbit.week1.weightedquickunion;

import com.ffbit.week1.Find;

public class WeightedQuickUnion implements Find {

    private int[] holder;

    private int[] size;

    public WeightedQuickUnion(int capacity) {
        holder = new int[capacity];
        fillHolder();
        size = new int[capacity];
    }

    private void fillHolder() {
        for (int i = 0; i < holder.length; i++) {
            holder[i] = i;
        }
    }

    @Override
    public boolean connected(int x, int y) {
        return getRootOf(x) == getRootOf(y);
    }

    private int getRootOf(int e) {
        while (e != holder[e]) {
            e = holder[e];
        }

        return e;
    }

    @Override
    public void union(int x, int y) {
        int rootOfX = getRootOf(x);
        int rootOfY = getRootOf(y);

        if (size[rootOfX] < size[rootOfY]) {
            holder[rootOfY] = rootOfX;
            size[rootOfX] += rootOfY;
        } else {
            holder[rootOfX] = rootOfY;
            size[rootOfY] += rootOfX;
        }
    }

}
