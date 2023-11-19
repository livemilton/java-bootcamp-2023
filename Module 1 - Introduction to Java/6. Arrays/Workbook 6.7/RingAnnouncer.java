public class RingAnnouncer {
    public static void main(String[] args) {
        // Inside the workbook, an array stores Java's fight record.
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};

        // Use a for loop to count the number of wins, and update the following
        // variable.
        int wins = 0;
        int losses = 0;

        for (int i = 0; i < record.length; i++) {
            if (record[i].equals("WIN")) {
                wins = wins + 1;
            } else {
                losses = losses + 1;
            }
        }

        // Use a for loop to count the number of losses, and update the following
        // variable.

        // Instructions for this workbook are on Learn the Part (Workbook 6.7).

        System.out.println("\nWith a professional record of " + wins + " Wins and " + losses + " losses.");
        System.out.println("He is the pride of oracle: Java Fury!");


    }
}
