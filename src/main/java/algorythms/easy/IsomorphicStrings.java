package algorythms.easy;

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
