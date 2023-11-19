public class Airline {

    Person[] people; //array that stores Person objects...

    // ADD CONSTRUCTOR
    public Airline() {
        this.people = new Person[11];
    }

    // GETTER TO INDEX AND NEW OBJECT
    public Person getPerson(int index) {
        Person person = people[index];
        return new Person(person);
    }

    // SETTER TO INDEX AND PEOPLE WITH THE REFERENCE TO 11-1 = 10 ELEMENTS IN THE
    // ARRAY OF 11 ELEMENTS
    public void setPerson(Person person) {
        int index = person.getSeatNumber() - 1;
        people[index] = new Person(person);
    }
}
