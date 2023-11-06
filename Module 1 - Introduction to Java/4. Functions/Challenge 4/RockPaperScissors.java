import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String response = scan.nextLine();

        if (response.equals("yes")) {
            System.out.println("Great!");
            System.out.println("rock - paper - scissors, shoot!");
            String userChoice = scan.nextLine();
            String compChoice = computerChoice();

            String finalResult = result(userChoice, compChoice);
            printResult(userChoice, compChoice, finalResult);
            // – get the computer choice (can only be done after task 3).
            // – get the result (can only be done after task 4)
            // – print everything (can only be done after task 5).
        } else {
            System.out.println("Darn, some other time...!");
        }

        // Task 1: See if the user wants to play.

        /*
         * Task 2: Set up the game
         *
         *
         * • if the answer is yes:
         * – print: Great!
         * – print: rock - paper - scissors, shoot!
         * – pick up user's choice.
         * – get the computer choice (can only be done after task 3).
         * – get the result (can only be done after task 4)
         * – print everything (can only be done after task 5).
         *
         * • else:
         * – print: Darn, some other time...!
         */

        scan.close();
    }


    //Task 3  – Write a function where the computer picks a random choice.

    /**
     * Function name: computerChoice - picks randomly between rock paper and
     * scissors
     *
     * @return a choice (String).
     *
     *         Inside the function:
     *         1. Picks a random number between 0 and 2.
     *         2. if 0: returns the choice 'rock'
     *         if 1: returns the choice 'paper'
     *         if 2: returns the choice 'scissors'
     */
    public static String computerChoice() {
        int randomNumber = (int) (Math.random() * 3); // 0-2
        if (randomNumber == 0) {
            return "rock";
        } else if (randomNumber == 1) {
            return "paper";
        } else if (randomNumber == 2) {
            return "scissors";
        } else {
            return "Error in the app. Please visit this bug.";
        }
    }


    //Task 4  – Write a function that compares the choices and returns the result.

    /**
     * Function name: result - It returns the result of the game.
     *
     * @param yourChoice     (String)
     * @param computerChoice (String)
     * @return result (String)
     *
     *         Inside the function:
     *
     *         1. result is "You win!" if:
     *
     *         You: "rock" Computer: "scissors"
     *         You: "paper" Computer: "rock"
     *         You: "scissors" Computer: "paper"
     *
     *         2. result is "You lose" if:
     *
     *         Computer: "rock" You: "scissors"
     *         Computer: "paper" You: "rock"
     *         Computer: "scissors" You: "paper"
     *
     *         3. result is "It's a tie" if: Your choice equals computer choice.
     *
     *
     *         4. Otherwise, print "INVALID CHOICE" and exit the program.
     *
     *
     */

    public static String result(String yourChoice, String computerChoice) {
        String result = "";

        if (yourChoice.equals("rock") && computerChoice.equals("scissors")) {
            return "You Win!";
        } else if (yourChoice.equals("paper") && computerChoice.equals("rock")) {
            return "You Win!";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            return "You Win!";
        } else if (computerChoice.equals("rock") && yourChoice.equals("scissors")) {
            return "You Lose!";
        } else if (computerChoice.equals("paper") && yourChoice.equals("rock")) {
            return "You Lose!";
        } else if (computerChoice.equals("scissors") && yourChoice.equals("paper")) {
            return "You Lose!";
        } else if (yourChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else {
            System.out.println("INVALID CHOICE");
            System.exit(0);
        }

        return result;
      }

     //Task 5  – Write a function that prints your choice, the computer's, and the result.

    /**
     * Name: printResult - It prints everything (your choice, computer choice,
     * result)
     *
     * @param yourChoice     (String)
     * @param computerChoice (String)
     * @param result         (String)
     *
     *                       Inside the function:
     *
     *                       1. prints everything:
     *                       – prints: You chose: <your choice>
     *                       – prints: The computer chose: <computer choice>
     *                       – prints: <result>
     */
    public static void printResult(String yourChoice, String computerChoice, String Result) {
        System.out.println("\nYou chose: " + yourChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(Result);
    }

}
