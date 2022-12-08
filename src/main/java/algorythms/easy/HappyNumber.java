package algorythms.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    private int getNext(int number) {
        int squaresSum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            number /= 10;
            squaresSum += lastDigit * lastDigit;
        }
        return squaresSum;
    }

    public boolean isHappy(int number) {
        Set<Integer> seen = new HashSet<>();
        while (number != 1 && !seen.contains(number)) {
            seen.add(number);
            number = getNext(number);
        }
        return number == 1;
    }
}
