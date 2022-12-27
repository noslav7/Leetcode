package algorythms_general_training.medium.add_two_numbers;

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if (s.isEmpty()) {
            return "";
        }
        int inputLength = s.length();
        int longestSoFar = 0, startIndex = 0, endIndex = 0;
        boolean[][] palindrome = new boolean[inputLength][inputLength];

        for (int j = 0; j < inputLength; j++) {
            palindrome[j][j] = true;
            for (int i = 0; i < j; i++) {
                if (s.charAt(i) == s.charAt(j) && (j - i <= 2 || palindrome[i + 1][j - 1])) {
                    palindrome[i][j] = true;
                    if (j - i + 1 > longestSoFar) {
                        longestSoFar = j - i + 1;
                        startIndex = i;
                        endIndex = j;
                    }
                }
            }
        }
        return s.substring(startIndex, endIndex + 1);
    }
}

/*
Given a string s, return the longest
palindromic substring in s.

Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
 */
