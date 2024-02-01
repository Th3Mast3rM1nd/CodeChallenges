import java.util.Scanner;
public class MinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNumber = 1;
        int maxNumber = 1;
        boolean isTrue = true;
        do {

            System.out.println("Enter A number or Character to Quit ");
            String stringNumber = scanner.nextLine();
            try {
                int number = Integer.parseInt(stringNumber);
                if (number < minNumber ){
                    minNumber = number;
                } else if (number > maxNumber) {
                    maxNumber = number;
                }
            } catch (NumberFormatException e) {
               isTrue = false;
            }

        } while (isTrue);
        System.out.println(" Min number is " + minNumber + "Max number is " + maxNumber);
    }
}
