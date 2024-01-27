public class MegaBytesConverter {
    public static void main(String[] args) {
    printMegaBytesAndKiloBytes(1);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes;
        int restKiloBytes;
        if ( kiloBytes >= 0 ) {
            megaBytes = (int) (kiloBytes / 1024);
            restKiloBytes = (int) (kiloBytes % 1024);
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + restKiloBytes + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
