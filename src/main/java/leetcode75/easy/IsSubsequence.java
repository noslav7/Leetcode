package leetcode75.easy;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if ((s.charAt(i) == t.charAt(j))) {
                    builder.append(t.charAt(j));
                    if (i < s.length() - 1) {
                        i++;
                    } else {
                        break;
                    }
                }
            }
        }
        String resultString = builder.toString();
        if (resultString.equals(s)) {
            return true;
        } else {
            return false;
        }
    }
}
