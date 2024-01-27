public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(1.123,1.124));
    }
    public static boolean areEqualByThreeDecimalPlaces(double numberOne,double numberTwo) {
        boolean isEqual = false;
        if ( (int) (numberOne * 1000) == (int) (numberTwo * 1000) ) {
            isEqual = true;

        } else {
            isEqual = false;
        }
        return isEqual;
    }
}
