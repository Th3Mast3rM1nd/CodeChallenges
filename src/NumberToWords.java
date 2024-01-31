public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(reverse(100));
        System.out.println(getDigitCount(100));
        numberToWords(-222);

    }

    public static void numberToWords(int number) {
        int revNumber = reverse(number);
        int count = getDigitCount(number);
    if (number < 0 ) {
        System.out.println("Invalid Value");
    } else {

        for (int i = 0; i < count ; i++) {
            number = revNumber % 10;
            String word =  switch (number) {
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8-> "Eight";
                case 9 -> "Nine";
                default -> "";
            };
            System.out.println(word);
            revNumber /= 10;
        }
    }

    }
    public static int reverse(int numberToRevers) {
        int reNumber = 0;
        int lastDigit = 0;
        int reverse = 0;
        while (numberToRevers != 0) {
            lastDigit = numberToRevers % 10;
            reverse = (reverse * 10 ) + lastDigit;
            numberToRevers = numberToRevers / 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        int checkNumber = number;
        int lastDigit = 0;
        while (number != 0) {
            lastDigit = number % 10;
            number = number / 10;
            count++;
        }
        if (checkNumber < 0) {
            return -1;
        } else {
            return count;
        }
    }
}


