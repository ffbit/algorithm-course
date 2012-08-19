package com.ffbit.week1.quickfind;

public class QuickFind implements Find {

    private int[] relationHolder;

    public QuickFind(int capacity) {
        relationHolder = new int[capacity];
        
        initRelationHolder();
    }

    @Override
    public boolean connected(int x, int y) {
        return x == y || relationHolder[x] == relationHolder[y];
    }

    @Override
    public void union(int x, int y) {
        relationHolder[y] = relationHolder[x]; 
    }
    
    private void initRelationHolder() {
        for (int i = 0; i < relationHolder.length; i++) {
            relationHolder[i] = i;
        }
    }

}
