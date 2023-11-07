import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

        // See detailed instructions on Learn the Part.
        // Task 1 - Get integers from the user.

        // You'll ask the user three questions:
        // 1. Pick a number to count by: <number>

        System.out.print("Pick a number to count by: ");
        int step = scan.nextInt();

        // 2. Pick a number to start counting from: <number>
        System.out.print("Pick a number to start counting from: ");
        int start = scan.nextInt();

        // 3. Pick a number to count to: <number>
        System.out.print("Pick a number to count to: ");
        int stop = scan.nextInt();

        // Task 2 - Write a loop

        // Make a for loop that:
        // starts from the second number.
        // stops at the third number.
        // counts in steps of the first.
        // Then, print your count in ONE line.
        for (int i = start; i < stop; i += step) {
            System.out.print(i + " ");
        }

        scan.close();
    }

}
