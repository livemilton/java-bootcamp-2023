public class Exams {
    public static void main(String[] args) {

        // Instructions for this workbook are on Learn the Part (Workbook 6.2).


        // Compare your result to what's on Learn the Part.

        // Exams (Revisited)
        // Another wave of students needs to write their exams.

        // Create a new array of five students.
        String[] students = { "Malfoy", "Crabbe", "Goyle", "Pansy", "Dean" };

        // Create a for loop that runs through the array, and prints a message for each
        // element.
        System.out.println("It's time to take your 5th years exams. Please, take your seats.\n");

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + ", you will take seat " + i);
        }

    }
}
