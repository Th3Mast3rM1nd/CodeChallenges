public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }
    public static int getLargestPrime(int number) {
        int primeNumber = 2;
        int prime = 0;
        if ( number <= 1) {
            prime = -1;
        } else {
            for (int i = 2 ; i <= number ; i++) {
                if (i % 2 != 0) {
                    primeNumber = i;

                    if (primeNumber * i == number && primeNumber >= i) {
                        prime = i;
                    } else {
                        prime = primeNumber;
                    }
                }
            }
        }

        return prime;
    }
}
