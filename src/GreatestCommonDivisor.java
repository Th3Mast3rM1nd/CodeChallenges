public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int firstNumber = 0;
        int minNumber = 0;
        if (first <= second) {
            minNumber = first;

        } else {
            minNumber = second;
        }
        if (first < 10 || second < 10) {
            return -1;
        } else {
            for (int i = 1; i <= minNumber; i++) {
                if (first % i == 0 && second % i == 0) {
                    firstNumber = i;
                }

            }
            return firstNumber;
        }
    }
}
