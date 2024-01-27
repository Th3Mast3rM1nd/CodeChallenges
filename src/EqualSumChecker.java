import javax.print.attribute.standard.MediaSize;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,1,3));
    }
    public static boolean hasEqualSum(int numberOne, int numberTwo, int numberThree ) {
        boolean isEqual = false;
        if (numberOne + numberTwo == numberThree) {
            isEqual = true;
        } else {
            isEqual = false;
        }
        return isEqual;
    }
}
