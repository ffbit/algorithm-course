package com.ffbit.week1.binarysearch;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BinarySearchTest {

    private int[] input;
    private int needle;
    private int expected;
    private BinarySearch binarySearch;

    public BinarySearchTest(int[] input, int needle, int expected) {
        this.input = input;
        this.needle = needle;
        this.expected = expected;
    }

    @Parameters
    public static Collection<Object[]> parameters() {
        Object[][] params = {
                { new int[] { 1, 2, 3, 5, 6, 7, 8, 9, 12, 15, 25 }, 1, 0 },
                { new int[] { 1, 2, 3, 5, 6, 7, 8, 9, 12, 15, 25 }, 25, 10 },
                { new int[] { 1, 2, 3, 5, 6, 7, 8, 9, 12, 15, 25 }, -2, -1 },
                { new int[] { 1, 2, 3, 5, 6, 7, 8, 9, 12, 15, 25 }, 26, -12 },
                { new int[] { 1, 2, 3, 5, 6, 7, 8, 9, 12, 15, 25 }, 8, 6 },
                { new int[] {}, 1, -1}
        };

        return Arrays.asList(params);
    }

    @Before
    public void setUp() throws Exception {
        binarySearch = new BinarySearch();
    }

    @Test
    public void itShoultReturnRightIndex() throws Exception {
        assertThat(binarySearch.search(input, needle), equalTo(expected));
    }
    
}
