import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

        int number = 8;

        System.out.print("I chose a number between 1 and 10. Try to guess it: ");

       Scanner scan = new Scanner(System.in);

       int adivinar = scan.nextInt();

       //See Learn the Part for detailed instructions.
       while (adivinar != number) {
           System.out.println("Guess again: ");
           adivinar = scan.nextInt();
       }
       System.out.println("Congratulations!");

        scan.close();
    }

}
