public class SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(13, -100));
        System.out.println(isOdd(-5));
    }

    public static boolean isOdd(int number) {
        if (number > 0) {
            return false;
        }
        return number % 2 == 1;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (end >= start && end > 0 && start > 0) {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
        } else {
            sum = -1;
        }
        return sum;
    }
}
