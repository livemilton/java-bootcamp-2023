public class HighScore {
    public static void main(String[] args) {

        // task 2
        // Create an array that stores 10 random numbers.
        int[] randomNumbers = { randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),
                randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber() };
        int highScore = 0;
        // task3
        // Use a for loop to print every element on the same line. Leave one space
        // between each element.
        System.out.print("Here are the scores: ");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");

            // task 4
            // Your code contains a highScore variable.
            // Use a for loop to update the variable with the highest score in the array,
            // and print it.
            if (randomNumbers[i] > highScore) {
                highScore = randomNumbers[i];
            }
        }

        // Hint: your loop needs a condition that updates the variable whenever an
        // element is higher.

        // Instructions for this workbook are on Learn the Part (Workbook 6.5).

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");

    }

    // task 1
    // Make a function that returns a random number between 0 to 49999.

    /**
     * Function name - randomNumber
     *
     * @return (int)
     *
     *         Inside the function
     *         - returns a random number between 0 to 49999
     *
     */

    public static int randomNumber() {
        double randomNumber = Math.random() * 50000; // 0 - 49999
        int randomInt = (int) randomNumber;
        return randomInt;
    }

}
