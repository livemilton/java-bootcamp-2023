public class ForLoopExamples {

    public static void main(String[] args) {
        // Example 1: Print numbers from 1 to 10
        // TODO: Write a for loop that prints numbers from 1 to 10
        System.out.println("\n Number 1-10");
        for (int i = 1; i < 10; i++) { // 1 2 3 4 5 6 7 8 9 10 11
            System.out.println(i);
        }
        // Example 2: Print "Hello, world!" 5 times
        // TODO: Write a for loop that prints "Hello, world!" 5 times
        System.out.println("\n Hello world");
        for (int i = 0; i < 5; i++) { // 0 1 2 3 4
            System.out.println("Hello, world!");
        }

        // Example 3: Print the multiplication table of 5 up to 10
        // TODO: Write a for loop that prints the multiplication table of 5 up to 10 (5
        // x 1, 5 x 2, ..., 5 x 10)
        System.out.println("\nMultiplication Table");
        for (int i = 1; i < 11; i++) {
            System.out.println(i + ": " + i * 5);
        }

        // Example 4: Print the numbers from 10 to 1 in reverse order
        // TODO: Write a for loop that prints numbers from 10 to 1 in reverse order
        System.out.println("\nReverse Order");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // Example 5: Print the first 10 even numbers
        // TODO: Write a for loop that prints the first 10 even numbers

        // 0 2 4 6 8 10 12 14 16 18
        System.out.println("\n Even numbers");
        for (int i = 0; i < 19; i += 2) {
            System.out.println(i);
        }

        // quizz 1
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        // quizz 2
        for (int i = 0; i <= 4; i++) {
            System.out.println(i);
        }

        // quizz 3
        System.out.print("Incoming counters: ");

        for (int i = 0; i <= 4; i++) {
            System.out.print(i + " ");
        }
        // quizz 4
        System.out.print("Incoming counters: ");
        for (int i = 0; i <= 4; i++) {
            System.out.println(i + " ");
        }

        // quizz 5
        for (int i = 10; i > 4; i--) {
            System.out.println(i + " ");
        }

        // quizz 6
        for (int i = 10; i >= 4; i--) {
            System.out.println(i + " ");
        }

        // quizz 7
        for (int i = 2; i < 10; i += 2) {
            System.out.println(i + " ");
        }

        // quizz 8
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i + " ");
        }

        // quizz 9
        for (int i = 10; i >= 2; i -= 2) {
            System.out.println(i + " ");
        }
    }
}
