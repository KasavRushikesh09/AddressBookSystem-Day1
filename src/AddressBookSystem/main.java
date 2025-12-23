package AddressBookSystem;

public class main {
    public static void main(String arg[]){
        AddressBookSystem system = new AddressBookSystem();
        system.addAddressBook("personal");
        AddressBook personal = new AddressBook();
        Contact c1 = new Contact("Aniket","Patil","MG Road",
                "Pune","MH","411001",
                "9876543210","aniket@gmail.com");

        personal.addContact(c1);

        personal.editContact("Aniket", "Mumbai");
//        personal.deleteContact("Aniket");
    }
}
