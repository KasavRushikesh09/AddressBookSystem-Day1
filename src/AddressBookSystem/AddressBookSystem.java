package AddressBookSystem;

import java.util.HashMap;

public class AddressBookSystem {

    private HashMap<String ,AddressBook> system = new HashMap<>();
    public void addAddressBook(String name) {
        if (!system.containsKey(name)) {
            system.put(name, new AddressBook());
            System.out.println("Address Book created: " + name);
        } else {
            System.out.println("Address Book already exists");
        }
    }
        public AddressBook getAddressBook (String name){
            return system.get(name);
        }
    }
}
