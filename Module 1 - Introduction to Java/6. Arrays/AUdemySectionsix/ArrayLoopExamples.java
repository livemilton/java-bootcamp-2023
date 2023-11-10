public class ArrayLoopExamples {

    public static void main(String[] args) {
        // Example 1: Print the elements of an integer array using a for loop
        int[] numbers = { 22, 24, 26, 29, 30 };
        // TODO: Use a for loop to print each element of the intArray

        for (int number : numbers) {
            System.out.println(number);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Example 2: Print the elements of a string array using a for loop
        String[] strArray = { "apple", "banana", "cherry" };
        // TODO: Use a for loop to print each element of the strArray

        for (String string : strArray) {
            System.out.println(string);
        }

        // Example 3: Print every second element of an integer array
        int[] grades = { 95, 80, 85, 70, 90, 60, 88, 78 };
        // TODO: Use a for loop to print every second element of the grades array (step
        // size of 2)
        for (int i = 0; i < grades.length; i += 2) {
            System.out.println(grades[i]);
        }

        // Example 4: Double the elements of an integer array
        int[] values = { 3, 5, 7, 9, 11 };
        // TODO: Use a for loop to double each element in the values array
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] * 2;
            System.out.println(values[i]);
        }

        // Example 5: Capitalize the elements of a string array
        String[] colors = { "red", "green", "blue" };
        // TODO: Use a for loop to capitalize each element in the colors array

        for (int i = 0; i < colors.length; i++) {
            colors[i] = colors[i].toUpperCase();
            System.out.println(colors[i]);
        }
        // Example 6: Find the index of a specific value in an integer array
        int[] data = { 4, 7, 4, 1, 4, 9, 4 };
        int targetValue = 4;
        // TODO: Use a for loop to find the index of targetValue in the data array
        for (int i = 0; i < data.length; i++) {
            if (data[i] == 4) {
                System.out.println(i);
            }
        }

        // quizz
        char[] array = { 'q', 'u', 'i', 'z', '6', '2' };
        System.out.println(array.length);

        // quizz
        char[] array1 = { 'q', 'u', 'i', 'z', '6', '2' };

        boolean bool = array[array1.length - 2] == array[3];

        // quizz
        // char[] array2 = { 'q', 'u', 'i', 'z', '6', '2' };

        // System.out.println(array2[array2.length]);

        // quizz //This is a very popular way of getting the last index in an array!
        char[] array3 = { 'q', 'u', 'i', 'z', '6', '2' };

        System.out.println(array3[array3.length - 1]);

        // Quizz
        char[] array4 = { 'q', 'u', 'i', 'z', '6', '2' };

        for (int i = 0; i < array4.length; i++) {
            System.out.println(array4[i]);
        }
        // Quizz --out of bounds
        // char[] array5 = { 'q', 'u', 'i', 'z', '6', '2' };

        // for (int i = 0; i <= array5.length; i++) {
        // System.out.println(array4[i]);
        // }

        // Quizz --out of bounds

        // char[] array6 = { 'q', 'u', 'i', 'z', '6', '2' };

        // for (int i = array6.length; i > 0; i--) {
        // System.out.println(array6[i]);
        // }

        // quizz

        char[] array7 = { 'q', 'u', 'i', 'z', '6', '2' };

        for (int i = array7.length - 1; i >= 0; i--) {
            System.out.println(array7[i]);
        }
    }
}
