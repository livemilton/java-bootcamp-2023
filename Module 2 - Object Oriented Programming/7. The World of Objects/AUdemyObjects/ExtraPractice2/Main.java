package ExtraPractice2;

public class Main {

    public static void main(String[] args) {
        
        Contact contact1 = new Contact("Alice","123-456-7890","1990-01-01");
        Contact contact2 = new Contact("Bob","234-567-8901", "1992-02-02");

        Contact[] contacts = {contact1, contact2};
        ContactManager contactManager = new ContactManager(contacts);

        //TEST the getContact method
        Contact retrievedContact = contactManager.getContact(0);
        System.out.println(retrievedContact.getName());


        //TEST the setContact method
        Contact newContact = new Contact("Chaarlie","345-678-9012", "1994-03-03");
        contactManager.setContact(newContact, 0);


        //verify that rhe contact was updated
        retrievedContact = contactManager.getContact(0);
        System.out.println(retrievedContact.getName());
    }
}
-