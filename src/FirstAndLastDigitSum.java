public class FirstAndLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(99));
    }

    public static int sumFirstAndLastDigit(int number) {
        int lastDigit = number % 10;
        int keeper = number;
        if (number < 0) {
            return -1;
        }
        while (number > 9) {
            number = number / 10;
            if (number > 0 && number < 9) {
                break;
            }
        }
        if (keeper > 0 && keeper < 9) {
            return lastDigit + keeper;
        } else {
            return lastDigit + number;
        }
    }
}
