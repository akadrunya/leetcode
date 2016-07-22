package ua.drunya;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Leetcode4Test {

    @Test
    public void test1() throws Exception {
        assertEquals(2, new Leetcode4().findMedianSortedArrays(new int[]{1, 3}, new int[]{2}), 0.000001);
    }

    @Test
    public void test2() throws Exception {
        assertEquals(2.5, new Leetcode4().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 0.000001);
    }

    @Test
    public void test3() throws Exception {
        assertEquals(100000.5, new Leetcode4().findMedianSortedArrays(new int[]{100000}, new int[]{100001}), 0.000001);
    }
}