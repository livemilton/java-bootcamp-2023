//import Scanner

import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {

        // See Learn the Part for the complete instructions.

        // set up scanner.
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nHello. What is your name?");
        // Pick up user's name and store it.
        String name = scanner.nextLine();

        // add new a line before asking next question.
        System.out.println("\nHi " + name + " I'm Javabot. Where are you from?");
        // Pick up user's home and store it.
        String country = scanner.nextLine();

        // add new a line before asking next question.
        System.out.println("\nI hear it's beautiful at " + country + " I'm from a place called Oracle");
        System.out.println("How old are you?");
        //Pick up age and store it.
        int age = scanner.nextInt();MILLISECOND

        scanner.nextLine();
        //add new a line before asking next question.
        System.out.println("\nSo you're " + age + ", cool! I'm 400 years old.");
        System.out.println("This means I'm " + (400 / age) + " times older than you.");
        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
        // Pick up language and store it.
        String language = scanner.nextLine();

        //add new a line here.
        System.out.println("\n" + language + ", that's great! Nice chatting with you " + name
                + ". I have to log off now. See ya!");

        // close scanner.


    }
}
