public class arrayQuizz {

    public static void main(String[] args) {

        int[][] table = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print(table[i][i]);
            }
        }

        int[][] table_1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (int i = 0; i < table_1.length; i++) {
            for (int j = 0; j < table_1.length; j++) {
                System.out.print(table[j][j]);
            }
        }

    }

}
