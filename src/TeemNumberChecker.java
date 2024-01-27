import javax.print.attribute.standard.MediaSize;
import javax.swing.table.TableRowSorter;

public class TeemNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(22,23,13));
        System.out.println(isTeen(9));
    }
    public static boolean hasTeen(int ageOne, int ageTwo, int ageThree ) {
       boolean isTeen = true;
       if ((ageOne >= 13 && ageOne <= 19 ) || (ageTwo >= 13 && ageTwo <= 19 ) || (ageThree >= 13 && ageThree <= 19 )) {
           isTeen = true;
       } else {
           isTeen = false;
       }
       return isTeen;
    }

    public static boolean isTeen(int age)
    {
        boolean isTeen = true;
        if (age >= 13 && age <= 19 ) {
            isTeen = true;
        } else {
            isTeen = false;
        }
        return isTeen;
    }
}
