public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(9,0,5));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int BIG_WEIGHT = 5;
        boolean isTrue = true;
        if (bigCount  <  0 || smallCount < 0 || goal < 0 ) {
            isTrue = false;
        }
        if ((bigCount * 5 + smallCount >= goal) && (goal % 5 <= goal )) {
                isTrue = true;
        } else {
            isTrue = false;
        }
        return  isTrue;
    }
}
