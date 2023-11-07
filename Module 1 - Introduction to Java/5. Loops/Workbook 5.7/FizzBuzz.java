public class FizzBuzz {
    public static void main(String[] args) {

        // See Learn the Part for detailed instructions.
        // task 1
        // Make a for loop that counts from 0 to 18 and print each number.

        for (int i = 0; i < 19; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i + " FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz");
            }
        }

    }
}

