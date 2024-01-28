public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(false,34));
    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean isPlaying = true;
        if (summer && temperature >= 25 && temperature <= 45 ) {
            isPlaying = true;
        } else  if (!summer && temperature >= 25 && temperature <= 35 ){
            isPlaying = true;
        } else {
            isPlaying = false;
        }
        return isPlaying;
    }

}
