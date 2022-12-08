package algorythms.easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int remainder, sum = 0, temp;
        temp = x;

        while (x > 0) {
            remainder = x % 10;
            sum = sum * 10 + remainder;
            x = x / 10;
        }

        if (temp == sum) {
            return true;
        } else {
            return false;
        }
    }
}
