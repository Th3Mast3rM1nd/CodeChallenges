public class PrimeNumbers {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 10; i <= 50; i++ ) {
            if (isPrime(i)) {
                // System.out.println(i + " is " + (isPrime(i) ? "Prime " + counter++ : "is Not Prime"));
                counter++;
                System.out.println("number " + i + " is a Prime number");
            }
            if (counter == 3) {
                System.out.println("Found 3 - Exiting for loop ");
                break;
            }
        }

    }

    public static boolean isPrime(int number)
    {
        if (number <= 1 ) {
            return false;
        } else if (number == 2) {
            return true;
        } else if (number % 2 != 0) {
            return true;
        }
        return false;
    }
}
