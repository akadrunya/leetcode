package ua.drunya;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Leetcode3Test {
    @Test
    public void test1() throws Exception {
        assertEquals(3, new Leetcode3().lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void test2() throws Exception {
        assertEquals(1, new Leetcode3().lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void test3() throws Exception {
        assertEquals(3, new Leetcode3().lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void test4() throws Exception {
        assertEquals(1, new Leetcode3().lengthOfLongestSubstring("c"));
    }
}