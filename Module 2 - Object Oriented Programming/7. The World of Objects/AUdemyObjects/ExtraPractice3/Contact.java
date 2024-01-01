package ExtraPractice3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Contact {

    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    // Remove the int age from Contact constructor
    public Contact(String name, String phoneNumber, String birthDate /* int age */) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        // this.age = age;
        this.age = toAge(birthDate);
    }

    public Contact(Contact source) {
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }

    // create toAge method that converts the birthDate string to an age.

    private int toAge(String birthDate) {

        // implementation here
        LocalDate parsedBirthDate = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(parsedBirthDate, currentDate);

        return period.getYears();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        setAge(toAge(birthDate));
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name=" + this.name + "\n" + "PhoneNumber=" + this.phoneNumber + "\n" + "BirthDate=" + this.birthDate
                + "\n" + "Age=" + this.age + " year old\n";
    }

}
