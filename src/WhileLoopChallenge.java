public class WhileLoopChallenge {
    public static void main(String[] args) {
        int start = 4;
        int end = 20;
        while (start <= end) {
            if (isEvenNumber(start)) {
                System.out.println(start);
            }
            start++;
        }
    }

    public static boolean isEvenNumber(int number) {
        if (number < 0) {
            return false;
        }
        return (number % 2 == 0);
    }
}
