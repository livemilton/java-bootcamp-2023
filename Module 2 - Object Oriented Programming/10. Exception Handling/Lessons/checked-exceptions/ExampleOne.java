import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.*;

public class ExampleOne {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream(
                    "D:\\javaBootcamp_course\\java-bootcamp-2023\\Module 2 - Object Oriented Programming\\10. Exception Handling\\Lessons\\checked-exceptions\\greetings.txt");
            Scanner scanner = new Scanner(fis);
            System.out.println(scanner.nextLine());
            scanner.close();
        } catch (FileNotFoundException exception) {
            // TODO Auto-generated catch block
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Process Complete");
        }

    }

}