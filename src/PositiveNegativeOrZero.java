import java.util.Scanner;

public class PositiveNegativeOrZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if the number");
        int userNumber = scanner.nextInt();
        checkNumber(userNumber);
    }
    public static void checkNumber(int number) {
        if (number == 0) {
            System.out.println("Zero");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }
}
