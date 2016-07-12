package ua.drunya;

import java.util.HashSet;

public class Leetcode3 {
    public int lengthOfLongestSubstring(String s) {

        int left = 0, right = 0;
        int max = 0;

        while (!(right > s.length())) {

            String substring = s.substring(left, right);
            if (ok(substring)) {
                if (substring.length() > max) {
                    max = substring.length();
                }
                right++;
            } else {
                left++;
            }

        }

        return max;
    }

    private boolean ok(String substring) {
        HashSet set = new HashSet();
        for (char i : substring.toCharArray()) {
            set.add(i);
        }
        return set.size() == substring.length();
    }
}
