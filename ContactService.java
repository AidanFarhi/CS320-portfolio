package contact;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private final Map<String, Contact> contacts;

    public ContactService() {
        this.contacts = new HashMap<>();
    }

    public Map<String, Contact> getContacts() {
        return contacts;
    }

    public void addContact(
            String contactID, String firstName, String lastName,
            String phone, String address) throws Exception {
        // check if the contactID already exists
        if (contacts.containsKey(contactID)) {
            throw new Exception(String.format("contactID %s already exists", contactID));
        }
        // create the Contact and put in contacts Map
        Contact newContact = new Contact(contactID, firstName, lastName, phone, address);
        contacts.put(contactID, newContact);
    }

    public void deleteContact(String contactID) throws Exception {
        // check if the contactID exists
        if (!contacts.containsKey(contactID)) {
            throw new Exception(String.format("contactID %s does not exist", contactID));
        }
        // delete the contact from the contacts Map
        contacts.remove(contactID);
    }

    public void updateContact(
            String contactID, String firstName, String lastName,
            String phone, String address) throws Exception {
        // check if the contactID exists
        if (!contacts.containsKey(contactID)) {
            throw new Exception(String.format("contactID %s does not exist", contactID));
        }
        // get the contact from the Map
        Contact contactToUpdate = contacts.get(contactID);
        // update the contact fields
        contactToUpdate.setFirstName(firstName);
        contactToUpdate.setLastname(lastName);
        contactToUpdate.setPhone(phone);
        contactToUpdate.setAddress(address);
        // put the new updated contact into the Map
        contacts.put(contactID, contactToUpdate);
    }
}
