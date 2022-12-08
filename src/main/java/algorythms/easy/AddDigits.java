package algorythms.easy;

public class AddDigits {
    public static int addDigits(int num) {
        int sum = 0;
        while (num > 9) {
            sum = 0;
            while (num != 0) {
                int lastDigit = num % 10;
                sum += lastDigit;
                num /= 10;
            }
            num = sum;
        }
        System.out.println(num);
        return num;
    }
}
