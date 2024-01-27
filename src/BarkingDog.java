public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,-1));
    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean result = false;
        if (hourOfDay >= 0 && hourOfDay <= 23) {
            if ( barking && hourOfDay  < 8 ||  hourOfDay > 22 ) {
                result = true;
            } else {
                result = false;
            }
        } else  {
            result = false;
        }
        return result;
    }
}
