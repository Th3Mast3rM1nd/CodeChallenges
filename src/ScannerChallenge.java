import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFalse = false;
        int count = 1;
        int sum = 0;
        do {
                System.out.println("Enter number #" + count);
                String sNumber = scanner.nextLine();
                try {
                    int number = Integer.parseInt(sNumber);
                    count++;
                    sum += number;
                } catch (NumberFormatException e)
                {
                    System.out.println("Invalid Number");
                }
        } while (count != 6);
        System.out.println("The sum of the number is " + sum );
    }

}
