package ua.drunya;

public class Leetcode5 {
    public String longestPalindrome(String s) {

        String result = String.valueOf(s.charAt(0));

        for (int i = 0; i < s.length(); i++) {

            int k = 0;
            for (int j = result.length() + 1; j <= s.length(); j++) {
                int to = i + j / 2;
                int from = to - j + 1;

                if (from < 0 || to >= s.length()) {
                    break;
                }
                String substring = s.substring(from, to + 1);
                if (palindrome(substring)) {
                    result = substring;
                    k = 0;
                } else if (k > 2) {
                    break;
                } else {
                    k++;
                }
            }

        }

        return result;

    }

    private boolean palindrome(String substring) {
        for (int i = 0; i < substring.length() / 2; i++) {
            if (substring.charAt(i) != substring.charAt(substring.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
