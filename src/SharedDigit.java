public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(13,12));
    }
    public static boolean hasSharedDigit(int numberOne , int numberTwo) {
        int nOne = numberOne;
        int nTwo = numberTwo;
        int digit = 0;
        int digitTwo = 0;
        boolean isShared = false;
        while (numberOne != 0) {
            digit = numberOne % 10;
            numberOne = numberOne / 10;
            for (int i = 0; i <= 1; i++) {
                digitTwo = numberTwo % 10;
                numberTwo = numberTwo / 10;
                if (digitTwo == digit || numberTwo == digit) {
                    isShared = true;
                    numberOne = 0;
                    break;
                } else if (numberTwo == 0) {
                    isShared = false;
                    numberOne = 0;
                    break;
                } else {
                    numberTwo = nTwo;
                }
            }
        }

        if (nOne <= 10 && nOne <= 99 || nTwo <= 10 && nTwo <= 99) {
            isShared = false;
            return  isShared;
        } else {
            return  isShared;
        }
    }
}
