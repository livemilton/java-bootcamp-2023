public class EvenOrOdd {
    public static void main(String[] args) {
        // See Learn the Part for detailed instructions.

        // Task 1
        // Make a for loop that counts from 0 to 19.
        for (int i = 0; i < 20; i++) {

            // Task 2
            // Using an if - else statement, mark each number as even or odd.
            if (i % 2 == 0) {
                System.out.println(i + " - even");
            } else {
                System.out.println(i + " - odd");
            }

        }

        //primosss
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }

    }

}
//