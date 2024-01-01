package MovieExample;

public class Movie {

    private String name;
    private String format;
    private double rating;

    public Movie(String name, String format, double rating) {
        this.name = name;
        this.format = format;
        this.rating = rating;
    }

    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the format
     */
    public String getFormat() {
        return this.format;
    }

    /**
     * @param format the format to set
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * @return double return the rating
     */
    public double getRating() {
        return this.rating;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";
    }

}
