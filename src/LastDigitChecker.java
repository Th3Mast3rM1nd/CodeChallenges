public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(71, 9, 11));
        System.out.println(isValid(10));
    }

    public static boolean hasSameLastDigit(int numberOne, int numberTwo, int numberThree) {
        int lastDigitOne = 0;
        int lastDigitTwo = 0;
        int lastDigitThree = 0;
        boolean isTheSame = true;
        lastDigitOne = numberOne % 10;
        lastDigitTwo = numberTwo % 10;
        lastDigitThree = numberThree % 10;
        if (lastDigitOne == lastDigitTwo || lastDigitTwo == lastDigitThree || lastDigitThree == lastDigitOne) {
            isTheSame = true;
        } else {
            isTheSame = false;
        }
        if ((!isValid(numberOne)) || (!isValid(numberTwo)) || (!isValid(numberThree))) {
            isTheSame = false;
        }

        return isTheSame;
    }

    public static boolean isValid(int number) {
        if (number >= 10 && number <= 1000) {
            return true;
        } else {
            return false;
        }
    }
}
