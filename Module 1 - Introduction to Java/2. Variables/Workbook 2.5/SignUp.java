import java.util.Scanner;

public class SignUp {

    public static void main(String[] args) {

        // Instructions for this workbook are on Learn the Part (see the Udemy Video: Workbook 2.5 to access the link).

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to JavaGram! Let's sign you up.");

        System.out.println("What is your first name?");
        String name = scan.next();
        scan.nextLine();// trap empty space

        System.out.println("What is your last name?");
        String lastname = scan.next();
        scan.nextLine();// trap empty space

        System.out.println("How old are you?");
        int age = scan.nextInt();
        scan.nextLine(); // trap empty space

        System.out.println("Make a username");
        String username = scan.next();
        scan.nextLine(); // trap empty space
        // If you experience trouble picking up the username, please carefully read the instructions on Learn the Part.

        System.out.println("What city do you live in?");
        String city = scan.next();
        scan.nextLine();// trap empty space

        System.out.println("What country is that?");
        String country = scan.next();
        scan.nextLine();// trap empty space

        System.out.println("Thank you for joining JavaGram!");
        System.out.println("\nHere is the information you entered:");
        System.out.println("\tFirst Name: " + name);
        System.out.println("\tLast Name: " + lastname);
        System.out.println("\tAge: " + age);
        System.out.println("\tUsername: " + username);
        System.out.println("\tCity: " + city);
        System.out.println("\tCountry: " + country);

        scan.close();

        // close scanner. It's good practice :D !
    }
}
