package algorythms;

public class HappyNumber {
    public static boolean isHappy(int n) {
        int sumSquares = 0;
        int count = 0;
        while (sumSquares != 1) {
            sumSquares = 0;
            count++;
            if (count == 1000) {
                break;
            }
            while (n != 0) {
                int lastDigit = n % 10;
                sumSquares = sumSquares + lastDigit * lastDigit;
                n /= 10;
            }
            n = sumSquares;
        }
        return count != 1000;
    }
}
