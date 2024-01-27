
public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1924));
    }


    public static boolean isLeapYear(int year) {
        boolean isLeap = false;
        if ((year <= 1) || (year > 9999)) {
            isLeap = false;
        } else if (year % 4 == 0) {
            if (year % 100 != 0) {
                isLeap = true;
            } else if (year % 100 == 0 && year % 400 == 0) {
                isLeap = true;
            }
        } else {
            isLeap = false;
        }
        return isLeap;
    }
}
