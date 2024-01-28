public class NumberOfDaysInMonth {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(-2,2020));
    }

    public static boolean isLeap(int year) {
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

    public static int getDaysInMonth(int month, int year) {
       boolean isLeap = isLeap(year);
       if (month < 1 || month > 12 || year < 1 || year > 9999) {
           return -1;

       }
       if (month == 2 && isLeap )
       {
           return 29;
       }
       return switch (month) {
           case 1,3,5,7,8,10,12 -> 31;
           case 4,6,9,11 -> 30;
           case 2 -> 28;
           default -> -1;
       };
    }

}

