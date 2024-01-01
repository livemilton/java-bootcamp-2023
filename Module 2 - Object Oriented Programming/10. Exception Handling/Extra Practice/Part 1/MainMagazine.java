import java.util.Scanner;

public class MainMagazine {
    public static void main(String[] args) {

        /* PART 1 ------------------ */
        // Magazine magazine1 = new Magazine("Magazine 1", "Publisher 1", 1, 2000);
        // System.out.println(magazine1.getTitle());

        // Uncomment the following line to test invalid input for setTitle method
        // magazine1.setTitle("");

        // Uncomment the following line to test invalid input for setPublisher method
        // magazine1.setPublisher("");

        // Uncomment the following line to test invalid input for setIssueNumber method
        // magazine1.setPublicationYear(0);

        // Uncomment the following line to test invalid input for the constructor
        // Magazine magazine2 = new Magazine("", "Publisher 2", 2, 2020);

        /* PART 2 ------------------ */
        // Magazine magazine1 = new Magazine("Magazine 1", "Publisher1", 1, 2020);
        // Magazine magazine2 = new Magazine("Magazine 2", "Publisher 2", 2, 2021);

        // MagazineLibrary library = new MagazineLibrary();

        // Test the addMagazine method
        // library.addMagazine(magazine1);
        // library.addMagazine(magazine2);

        // Test the getMagazine method
        // Magazine retrievedMagazine = library.getMagazine(0);
        // System.out.println(retrievedMagazine.getTitle());

        // Test the setMagazine method
        // Magazine newMagazine = new Magazine("Magazine 3", "Publisher 3", 3, 2022);
        // library.setMagazine(0, newMagazine);

        // Verify that the magazine was updated
        // retrievedMagazine = library.getMagazine(0);
        // System.out.println(retrievedMagazine.getTitle());

        /* PART 3 ------------------- */
        // METHOD MAIN
        Scanner scanner = new Scanner(System.in);

        String title = promptForTitle(scanner);
        String publisher = promptForPublisher(scanner);
        int issueNumber = promptForIssueNumber(scanner);
        int publicationYear = promptForPublicationYear(scanner);

        Magazine newMagazine = new Magazine(title, publisher, issueNumber, publicationYear);

        MagazineLibrary library = new MagazineLibrary();
        library.addMagazine(newMagazine);

        System.out.println("Magazin added to the library: " + newMagazine.getTitle());

    }
    // PART 3 METHODS AND FUCTION
    // Functions to test the exceptions --> title

    public static String promptForTitle(Scanner scanner) {
        while (true) {
            System.out.println("\nPlease enter a valid title: ");
            String title = scanner.nextLine();
            if (!isNullOrBlank(title)) {
                return title;
            }

        }
    }

    // Functions to test the exceptions --> publisher
    public static String promptForPublisher(Scanner scanner) {
        while (true) {
            System.out.println("\nPlease enter a valid publisher: ");
            String publisher = scanner.nextLine();

            if (!isNullOrBlank(publisher)) {
                return publisher;
            }
        }
    }

    // Functions to test the exceptions --> IssueNumber

    public static int promptForIssueNumber(Scanner scanner) {
        while (true) {
            System.out.println("\nPlease enter a valid issue number(greater than 0)");
            // check if the next input is not an integer
            if (!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }
            int issueNumber = scanner.nextInt();
            if (!incorrectIssueNumber(issueNumber)) {
                return issueNumber;
            }

        }
    }

    // Functions to test the exceptions --> PublicationYear

    public static int promptForPublicationYear(Scanner scanner) {
        while (true) {
            System.out.println("\nPlease enter a valid publication year(greater than 0)");
            // check if the next input is not an integer

            if (!scanner.hasNextInt()) {
                scanner.next();
                continue;
            }

            int publicationYear = scanner.nextInt();
            if (!incorrectPublicationyear(publicationYear)) {
                return publicationYear;
            }

        }

    }

    // Methods

    public static boolean isNullOrBlank(String input) {
        return (input == null || input.isBlank());
    }

    public static boolean incorrectIssueNumber(int issueNumber) {
        return (issueNumber <= 0);

    }

    public static boolean incorrectPublicationyear(int publicationYear) {
        return (publicationYear <= 0);
    }

}