import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {

        // See instructions on Learn the Part (Workbook 6.10)

        Scanner scan = new Scanner(System.in);

        System.out.println("How many pizza toppings do you want?");

        int numToppings = scan.nextInt();
        scan.nextLine();

        String[] toppings = new String[numToppings]; // Length of array equals what the user inputs.

        // new array for toppings that user write
        System.out.println("Great, enter each topping!");
        // Task 1 here
        // Create a for loop that runs through the length of the toppings array. Inside
        // the for loop:
        for (int i = 0; i < toppings.length; i++) {
            System.out.println(i + ". ");
            toppings[i] = scan.nextLine();
        }

        System.out.println("\nThank you! Here are the toppings you ordered");

        // Task 2 here
        // Create a for loop that runs through the length of the array and prints each
        // topping.
        for (int i = 0; i < toppings.length; i++) {
            System.out.println(i + ". " + toppings[i]);
        }

        System.out.println("\nPress anything to confirm your order.");
        scan.nextLine();
        System.out.println("Great, a driver is on the way!");

        scan.close();



    }
}
