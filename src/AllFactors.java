public class AllFactors {
    public static void main(String[] args) {
        printFactors(6);
    }

    public static void printFactors(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

