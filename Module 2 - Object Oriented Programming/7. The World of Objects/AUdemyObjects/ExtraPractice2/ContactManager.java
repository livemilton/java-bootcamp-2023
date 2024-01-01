package ExtraPractice2;

import ExtraPractice2.Contact;

public class ContactManager {

    private Contact[] contacts; // array of Contact objects

    public ContactManager(Contact[] contacts) {
        this.contacts = new Contact[contacts.length];

        for (int i = 0; i < contacts.length; i++) {

            // deep copy
            this.contacts[i] = new Contact(contacts[i]);
        }
    }

    // get
    public Contact getContact(int index) {
        return new Contact(contacts[index]);
    }

    // set

    public void setContact(Contact contact, int index) {
        this.contacts[index] = new Contact(contact);
    }
}
