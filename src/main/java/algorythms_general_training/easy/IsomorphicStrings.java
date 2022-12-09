package algorythms_general_training.easy;

import java.util.Arrays;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {

        int[] dictionaryStoT = new int[256];
        Arrays.fill(dictionaryStoT, -1);

        int[] dictionaryTtoS = new int[256];
        Arrays.fill(dictionaryTtoS, -1);

        for (int i = 0; i < s.length(); i++) {
                char char1 = s.charAt(i);
                char char2 = t.charAt(i);

                if (dictionaryStoT[char1] == -1 && dictionaryTtoS[char2] == -1) {
                            dictionaryStoT[char1] = char2;
                            dictionaryStoT[char2] = char1;
                } else if (!(dictionaryTtoS[char1] == char2 || dictionaryStoT[char2] == char1)) {
                    return false;
                }
        }
        return true;
    }
}

/*
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
Example 3:

Input: s = "paper", t = "title"
Output: true

Constraints:

1 <= s.length <= 5 * 104
t.length == s.length
s and t consist of any valid ascii character.
 */