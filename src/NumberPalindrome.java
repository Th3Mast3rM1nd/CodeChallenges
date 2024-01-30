public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(221));
    }

    public static boolean isPalindrome(int number) {
        boolean isPlain = false;
        int plainNumber = number;
        int reverse = 0;
        int lastDigit = 0;
        while (number != 0) {
            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        return (plainNumber == reverse);

    }
}
