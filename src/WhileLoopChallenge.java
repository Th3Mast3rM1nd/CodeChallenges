import java.io.FileOutputStream;

public class WhileLoopChallenge {
    public static void main(String[] args) {
        int start = 4;
        int end = 20;
        int foundEven = 0;
        int foundOdd = 0;
        while (start <= end) {
            if (isEvenNumber(start)) {
                System.out.println(start);
                foundEven++;
                if (foundEven == 5) {
                    break;
                }
            } else {
                foundOdd++;
            }
            start++;
        }
       System.out.println("Total Even number Found is " + foundEven);
        System.out.println("Total Even number Found is " + foundOdd);
    }

    public static boolean isEvenNumber(int number) {
        if (number < 0) {
            return false;
        }
        return (number % 2 == 0);
    }
}
