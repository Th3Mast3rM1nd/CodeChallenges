public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        int digits = 0;
        int sum = 0;
        if (number < 0) {
            return -1;
        }
        while (number != 0) {
            digits = number % 10;
            number = number / 10;
            if (digits % 2 == 0) {
                sum += digits;
            } else {
                continue;
            }
        }
        return sum;
    }
}
