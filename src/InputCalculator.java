import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
    inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int count = 0;
        boolean isTrue = true;
        while (isTrue) {
            String numberString = scanner.nextLine();
            try {
                int number = Integer.parseInt(numberString);
                sum += number;
                count++;
            } catch (NumberFormatException e) {
                isTrue = false;
            }
        }
        try {
            avg =  (Math.round( (double) sum / count));
            System.out.println("SUM = " + sum + " AVG " + avg);
        } catch (ArithmeticException exception) {
            System.out.println("SUM = " + sum + " AVG " + avg);
        }

    }
}
