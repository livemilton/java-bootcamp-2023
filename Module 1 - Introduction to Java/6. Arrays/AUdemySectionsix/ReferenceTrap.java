import java.util.Arrays;

public class ReferenceTrap {

    public static void main(String[] args) {

        String[] stafflastYear = { "Tommy", "Joel", "Ellie" };
        /** Reference trap */
        String[] staffThisYear = Arrays.copyOf(stafflastYear, stafflastYear.length);
        staffThisYear[1] = "Abby";
        // String[] staffThisYear = stafflastYear;

        // staffThisYear[1] = "Abby";

        // make a new String and copy values using a for loop
        // String[] staffThisYear = new String[3];
        // for (int i = 0; i < staffThisYear.length; i++) {
        // staffThisYear[i] = stafflastYear[i];
        // }
        // staffThisYear[1] = "Abby";

        System.out.println("Staff Last year " + Arrays.toString(stafflastYear));
        System.out.println("Staff This year " + Arrays.toString(staffThisYear));
    }

    // Arrays.copyOf(staffLastYear, staffLaster)
}
