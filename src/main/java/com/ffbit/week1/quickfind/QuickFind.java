package com.ffbit.week1.quickfind;

public class QuickFind implements Find {

    private int capacity;

    public QuickFind(int capacity) {
        this.capacity = capacity;
    }
    
    @Override
    public boolean connected(int x, int y) {
        return x == y;
    }

}
