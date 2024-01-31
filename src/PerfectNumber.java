public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        boolean isPerfect = true;
        if (number > 1) {
            for (int i = 1; i < number; i++) {
                if (number % i == 0 && sum != number) {
                    sum += i;
                }

            }
            if (sum == number) {
                isPerfect = true;
            } else {
                isPerfect = false;
            }

        } else {
            isPerfect = false;
        }
        return isPerfect;
    }
}
