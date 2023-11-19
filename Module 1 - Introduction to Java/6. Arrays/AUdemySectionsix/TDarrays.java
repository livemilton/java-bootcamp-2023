import java.util.Arrays;

public class TDarrays {

    public static void main(String[] args) {

        // 2D Arrays
        /*
         * An array that contains arrays
         * Perfect for data in the form of a table
         */

        int[][] grades = new int[3][4];
        // updating
        grades[0][0] = 72;
        grades[0][1] = 74;
        grades[0][2] = 78;
        grades[0][3] = 76;

        grades[1][0] = 65;
        grades[1][1] = 64;
        grades[1][2] = 61;
        grades[1][3] = 67;

        grades[2][0] = 95;
        grades[2][1] = 98;
        grades[2][2] = 99;
        grades[2][3] = 100;

        System.out.println("\tHarry" + Arrays.toString(grades[0]));
        System.out.println("\tRon" + Arrays.toString(grades[1]));
        System.out.println("\tHermione" + Arrays.toString(grades[2]));

        // access to a specific index in 2D array
        System.out.println("Access to index for every element in 2D array");
        System.out
                .println("\tHarry" + " " + grades[0][0] + " " + grades[0][1] + " " + grades[0][2] + " " + grades[0][3]);
        System.out
                .println("\tRon: " + " " + grades[1][0] + " " + grades[1][1] + " " + grades[1][2] + " " + grades[1][3]);
        System.out.println("\tHermone: " + grades[2][0] + " " + grades[2][1] + " " + grades[2][2] + " " + grades[2][3]);

        System.out.println("********");

        // example 2
        int[][] notes = {
                { 100, 99, 100, 96 },
                { 100, 91, 94, 100 },
                { 97, 98, 93, 95 },
        };
        System.out.println("\tJhon" + Arrays.toString(notes[0]));
        System.out.println("\tMilton" + Arrays.toString(notes[1]));
        System.out.println("\tHilda" + Arrays.toString(notes[2]));

        // quizz 1
        String[][] table = new String[3][3];
        System.out.println((table[0]));

        // quizz 2
        String[][] table1 = new String[3][3];
        System.out.println((Arrays.toString(table1[0])));

        // quizz 3
        String[][] table2 = new String[3][2];

        System.out.println(table2.length);
        System.out.println(table2[0].length);
        System.out.println(table2[1].length);

        // quizz 4

        String[][] table3 = new String[3][2];
        // System.out.println(Arrays.toString(table3[3]));

        // quizz 5

        String[][] table4 = new String[3][2];
        System.out.println(table4[2][0]);
        // System.out.println(table4[2][2]);

        System.out.println("**looping arrays**");
        // looping 2D Arrays

        int[][] gradesLooping = {
                { 72, 74, 78, 76 },
                { 65, 64, 61, 67 },
                { 95, 98, 99, 100 },
        };
        for (int j = 0; j < gradesLooping[0].length; j++) {
            System.out.print(gradesLooping[0][j] + " "); // [0][0] [0][1] [0][2] [0][3]
        }
        System.out.println("\n");
        for (int j = 0; j < gradesLooping[1].length; j++) {
            System.out.print(gradesLooping[1][j] + " "); // [1][0] [1][1] [1][2] [1][3]
        }
        System.out.println("\n");
        for (int j = 0; j < gradesLooping[2].length; j++) {
            System.out.print(gradesLooping[2][j] + " "); // [2][0] [2][1] [2][2] [2][3]
        }

        System.out.println("\n");
        System.out.println("using nested loops");

        int[][] gradesNested = {
                { 72, 74, 78, 76 },
                { 65, 64, 61, 67 },
                { 95, 98, 99, 100 },
        };

        for (int i = 0; i < gradesNested.length; i++) {

            switch (i) {
                case 0:
                    System.out.print("\tHarry: ");

                    break;
                case 1:
                    System.out.print("\tRon: ");

                    break;

                case 2:
                    System.out.print("\nHermione: ");

                    break;

            }

            for (int j = 0; j < gradesNested[i].length; j++) {
                System.out.print(gradesNested[i][j] + " ");
            }
            System.out.println("\n");
        }

        // quizz

        int[][] table5 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int j = 0; j < table5.length; j++) {
            System.out.print(table[0][j]);
        }

        int[][] table6 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int i = 0; i < table6.length; i++) {
            System.out.print(table[i][0]);
        }

        int[][] table7 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int i = 0; i < table7.length; i++) {
            for (int j = 0; j < table7.length; j++) {
                System.out.print(table[j][i]);
            }
        }

    }
}
