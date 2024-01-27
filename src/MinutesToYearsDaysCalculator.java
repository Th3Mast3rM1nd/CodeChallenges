public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        int days;
        int years = 0;
        if (minutes >= 0) {

            days = (int) ((minutes / 60) / 24);
            if (days >= 365) {
                years = (int) (days / 365);
                days = (int) (days % 365);
            } else {
                years = (int) (days / 365);
            }
            System.out.println(minutes + " min " + " = " + years + " y " + " and " + days + " d");
        } else {
            System.out.println("Invalid Value ");
        }


    }
}
