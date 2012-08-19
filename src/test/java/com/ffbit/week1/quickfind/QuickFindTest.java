package com.ffbit.week1.quickfind;

import static org.junit.Assert.assertFalse;
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
    public void itShouldBeSymmetricConnected() throws Exception {
        find.union(1, 2);

        assertTrue(find.connected(1, 2));
        assertTrue(find.connected(2, 1));
    }

    @Test
    public void itShouldNotBeSymmetricConnected() throws Exception {
        find.union(1, 2);

        assertFalse(find.connected(2, 3));
        assertFalse(find.connected(3, 2));
    }

    @Test
    public void itShouldBeConnectedTransitive() throws Exception {
        find.union(1, 2);
        find.union(2, 3);

        assertTrue(find.connected(1, 3));
    }

    @Test
    public void itShouldBeNotConnectedTransitive() throws Exception {
        find.union(1, 2);
        find.union(2, 3);

        assertFalse(find.connected(0, 1));
    }

    @Test
    public void itShouldBeConnectedTransitiveThoughUnitedUnions()
            throws Exception {
        find.union(1, 2);

        find.union(3, 4);

        find.union(1, 4);

        assertTrue(find.connected(3, 2));
    }

}
