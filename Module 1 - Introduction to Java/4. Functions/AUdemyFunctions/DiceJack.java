import java.util.Scanner;

public class DiceJack {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three number between 1 and 6: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (isLessThan1(num1, num2, num3) || ishigherThan6(num1, num2, num3)) {
            System.out.println("You entered number(s) outside the valid range");
            System.exit(0);
        }

        int sumOfNumbers = num1 + num2 + num3;
        int sumOfDiceRolls = roll1 + roll2 + roll3;

        System.out.println("Your Sum: " + sumOfNumbers + " Dice Sum: " + sumOfDiceRolls);

        if (userWon(sumOfNumbers, sumOfDiceRolls)) {
            System.out.println("\nCongratulations, you won!");
        } else {
            System.out.println("\nBetter luck next Time!");
        }

        scanner.close();

    }

    public static boolean isLessThan1(int num1, int num2, int num3) {
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }

    public static boolean ishigherThan6(int num1, int num2, int num3) {
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }

    public static boolean userWon(int sumNumbers, int sumDiceRolls) {
        return (sumNumbers > sumDiceRolls && (sumNumbers - sumDiceRolls) < 5);
    }

    public static int rollDice() {
        // 0 - 0.999999999
        double randomNumer = Math.random() * 6; // 0 - 5.999999999999
        randomNumer += 1; // 1 - 6.9999999999
        return (int) randomNumer; // 1-6
    }
}
