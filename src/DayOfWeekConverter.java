public class DayOfWeekConverter {
    public static void main(String[] args) {
        printDayOfWeek(0);
        printWeekDay(1);
    }

    public static void printDayOfWeek(int day) {
        String dayOfTheWeek = switch (day) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Thursday";
            case 3 -> "Wednesday";
            case 4 -> "thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
        System.out.println(day + " stands for " + dayOfTheWeek);
    }

    public static void printWeekDay(int day) {
        String dayOfWeek = "Invalid Day";
        if (day == 0) {
            dayOfWeek = "Sunday";
        } else if (day == 1) {
            dayOfWeek = "Monday";
        }
        System.out.println(day + "Stands for " + dayOfWeek);
    }
}

