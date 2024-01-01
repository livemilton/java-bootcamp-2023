package MovieExample;

public class Main {

    // to store
    static Store store = new Store();

    public static void main(String[] args) {

        /*
         * Method 1 to pupulate
         * Movie movie = new Movie("The Shawshank Redemption", "BlueRay", 9.2);
         * Movie movie2 = new Movie("The Godfather", "BlueRay", 9.1);
         * Movie movie3 = new Movie("The Godfather: Part II", "DVD", 9.0);
         * Movie movie4 = new Movie("The Dark Knight", "BlueRay", 9.0);
         * Movie movie5 = new Movie("Schindler's List", "DVD", 8.9);
         * Movie movie6 = new Movie("The Lord of the Rings: The Return of the King",
         * "BlueRay", 8.9);
         * Movie movie7 = new Movie("Pulp Fiction", "DVD", 8.8);
         * Movie movie8 = new Movie("Pulp Fiction", "DVD", 8.8);
         * 
         * System.out.println(movie.getRating() + "\t" + movie.getFormat() + "\t    " +
         * movie.getName());
         * System.out.println(movie2.getRating() + "\t" + movie2.getFormat() + "\t    "
         * + movie2.getName());
         * System.out.println(movie3.getRating() + "\t" + movie3.getFormat() + "\t    "
         * + movie3.getName());
         * System.out.println(movie4.getRating() + "\t" + movie4.getFormat() + "\t    "
         * + movie4.getName());
         * System.out.println(movie5.getRating() + "\t" + movie5.getFormat() + "\t    "
         * + movie5.getName());
         * System.out.println(movie6.getRating() + "\t" + movie6.getFormat() + "\t    "
         * + movie6.getName());
         * System.out.println(movie7.getRating() + "\t" + movie7.getFormat() + "\t    "
         * + movie7.getName());
         * System.out.println(movie8.getRating() + "\t" + movie8.getFormat() + "\t    "
         * + movie8.getName());
         */

        /* Method 2 to pupulate */

        Movie[] movies = new Movie[] {
                new Movie("The Shawshank Redemption", "BlueRay", 9.2),
                new Movie("The Godfather", "BlueRay", 9.1),
                new Movie("The Godfather: Part II", "DVD", 9.0),
                new Movie("The Dark Knight", "BlueRay", 9.0),
                new Movie("Schindler's List", "DVD", 8.9),
                new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
                new Movie("Pulp Fiction", "DVD", 8.8),
                new Movie("Pulp Fiction", "DVD", 8.8)

        };

        System.out.println("********************IMDB****************************");

        /*
         * for (int i = 0; i < movies.length; i++) {
         * System.out.println(movies[i]);
         * }
         */
        for (int i = 0; i < movies.length; i++) {
            store.setMovie(i, movies[i]);
        }

        // store.getMovie(4);

        printStore();

    }

    public static void printStore() {
        System.out.println("********************************MOVIE STORE*******************************");
        System.out.println(store);
    }

}
