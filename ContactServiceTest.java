package contact;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

public class ContactServiceTest {

    @Test
    void testAddContact() throws Exception {
        ContactService cs = new ContactService();
        cs.addContact(
                "abc123",
                "bob",
                "bobson",
                "6461234567",
                "123 Place Street"
        );
        Map<String, Contact> contacts = cs.getContacts();
        assertEquals("abc123", contacts.get("abc123").getContactID());
        assertEquals("bob", contacts.get("abc123").getFirstName());
        assertEquals("bobson", contacts.get("abc123").getLastName());
        assertEquals("6461234567", contacts.get("abc123").getPhone());
        assertEquals("123 Place Street", contacts.get("abc123").getAddress());
    }

    @Test
    void testAddContactGivenContactIDExists() throws Exception {
        ContactService cs = new ContactService();
        cs.addContact(
                "abc123",
                "bob",
                "bobson",
                "6461234567",
                "123 Place Street"
        );
        assertThrows(Exception.class, () -> cs.addContact(
                "abc123",
                "Joe",
                "Johnson",
                "9178889999",
                "333 Spot Ave."
        ));
    }

    @Test
    void testUpdateContact() throws Exception {
        ContactService cs = new ContactService();
        cs.addContact(
                "abc123",
                "bob",
                "bobson",
                "6461234567",
                "123 Place Street"
        );
        cs.updateContact(
                "abc123",
                "joe",
                "johnson",
                "2121234567",
                "123 No Place Street"
        );
        Map<String, Contact> contacts = cs.getContacts();
        assertEquals("joe", contacts.get("abc123").getFirstName());
        assertEquals("johnson", contacts.get("abc123").getLastName());
        assertEquals("2121234567", contacts.get("abc123").getPhone());
        assertEquals("123 No Place Street", contacts.get("abc123").getAddress());
    }

    @Test
    void testUpdateContactGivenContactIDDoesNotExist() throws Exception {
        ContactService cs = new ContactService();
        assertThrows(Exception.class, () -> cs.updateContact(
                "abc123",
                "joe",
                "johnson",
                "2121234567",
                "123 No Place Street"
        ));
    }

    @Test
    void testDeleteContact() throws Exception {
        ContactService cs = new ContactService();
        cs.addContact(
                "abc123",
                "bob",
                "bobson",
                "6461234567",
                "123 Place Street"
        );
        cs.deleteContact("abc123");
        Map<String, Contact> contacts = cs.getContacts();
        assertFalse(contacts.containsKey("abc123"));
    }

    @Test
    void testDeleteContactGivenContactIDDoesNotExist() throws Exception {
        ContactService cs = new ContactService();
        assertThrows(Exception.class, () -> cs.deleteContact("abc123"));
    }
}
