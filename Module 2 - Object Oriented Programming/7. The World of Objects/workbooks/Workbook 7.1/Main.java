import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Person persona1 = new Person();

        persona1.name = "milton";
        persona1.nationality = "colombiano";
        persona1.dateOfBirth = "1987";
        String[] array;
        array = new String[] { persona1.name, persona1.nationality, persona1.dateOfBirth };
        persona1.passport = array;
        persona1.seatNumber = 10;

        System.out.println(persona1.name);
        System.out.println(persona1.nationality);
        System.out.println(persona1.dateOfBirth);
        System.out.println(Arrays.toString(persona1.passport));
        System.out.println(persona1.seatNumber);
    }
}
