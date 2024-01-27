public class SpeedConverter {
    public static void main(String[] args) {
        long result = toMilesPerHour(10.20);
        printConversion(result);

    }
    public static long toMilesPerHour(double kilometersPerHour) {
        long milesPerHour;
        double oneMileToKilometer =  1.609d;
        if (kilometersPerHour < 0) {
            milesPerHour = -1;
        } else  {
            milesPerHour = Math.round(kilometersPerHour / oneMileToKilometer);
        }
        return milesPerHour;
    }
    public static  void printConversion(double kilometersPerHour) {
        if ( kilometersPerHour < 0)
        {
            System.out.println("Invalid Value");
        } else
        {
           System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}
