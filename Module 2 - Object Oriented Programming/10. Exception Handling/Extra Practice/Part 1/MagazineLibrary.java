import java.util.ArrayList;

public class MagazineLibrary {

    // An array of magazines
    private ArrayList<Magazine> magazines;

    public MagazineLibrary() {
        this.magazines = new ArrayList<>();
    }

    // getter
    public Magazine getMagazine(int index) {
        // asign the copy
        Magazine mCopy = new Magazine(this.magazines.get(index));
        return mCopy;
    }

    // setter copy Magazine to protect copy magazine

    public void setMagazine(int index, Magazine newMagazine) {
        // asign the copy
        Magazine mCopy = new Magazine(newMagazine);
        this.magazines.set(index, mCopy);
    }

    // add method with copy magazine to protect the internal state of our magazine
    // library

    public void addMagazine(Magazine newMagazine) {
        // Asign the copy
        Magazine mCopy = new Magazine(newMagazine);
        this.magazines.add(mCopy);
    }
}
