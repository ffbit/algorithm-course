package com.ffbit.week1.quickfind;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class QuickFindTest {

    private int capacity;

    private Find find;

    @Before
    public void setUp() throws Exception {
        capacity = 5;
        find = new QuickFind(capacity);
    }

    @Test
    public void itShouldBeReflexive() throws Exception {
        int element = 0;

        assertTrue(find.connected(element, element));
    }
    
    @Test
    public void itShouldBeConnected() throws Exception {
        int x = 1;
        int y = 2;
        
        find.union(x, y);
        
        assertTrue(find.connected(x, y));
    }

}
