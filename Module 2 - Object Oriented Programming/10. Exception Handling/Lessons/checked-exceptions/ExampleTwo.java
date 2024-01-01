import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class ExampleTwo {
    public static void main(String[] args) {

        try {
            readFile("greetings.txt");
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.getMessage();

        }
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(
                "D:\\javaBootcamp_course\\java-bootcamp-2023\\Module 2 - Object Oriented Programming\\10. Exception Handling\\Lessons\\checked-exceptions\\greetings.txt");
        Scanner scanner = new Scanner(fis);
        System.out.println(scanner.nextLine());
        scanner.close();
    }
}