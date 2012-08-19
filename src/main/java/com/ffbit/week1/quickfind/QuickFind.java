package com.ffbit.week1.quickfind;

public class QuickFind implements Find {

    private int[] relationHolder;

    public QuickFind(int capacity) {
        relationHolder = new int[capacity];
        
        initRelationHolder();
    }

    @Override
    public boolean connected(int x, int y) {
        return isTheSame(x, y) || isConnectedToTheSameElement(x, y);
    }

    private boolean isConnectedToTheSameElement(int x, int y) {
        return relationHolder[x] == relationHolder[y];
    }

    @Override
    public void union(int x, int y) {
        for (int i = 0; i <relationHolder.length; i++) {
            if (relationHolder[y] == relationHolder[i]) {
                relationHolder[i] = relationHolder[x];
            }
        }
    }
    
    private void initRelationHolder() {
        for (int i = 0; i < relationHolder.length; i++) {
            relationHolder[i] = i;
        }
    }
    
    private boolean isTheSame(int x, int y) {
        return x == y;
    }

}
