package contact;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

    @Test
    void testConstructorGivenValidInputs() throws Exception {
        Contact contact = new Contact(
                "A3G6A2A6D3",
                "Jimmy",
                "Hendrix",
                "6461234567",
                "123 Place Street"
        );
        assertEquals("A3G6A2A6D3", contact.getContactID());
        assertEquals("Jimmy", contact.getFirstName());
        assertEquals("Hendrix", contact.getLastName());
        assertEquals("6461234567", contact.getPhone());
        assertEquals("123 Place Street", contact.getAddress());
    }

    @Test
    void testConstructorGivenInvalidInputs() throws Exception {
        // contactID too long
        assertThrows(Exception.class, () -> {
            Contact contact = new Contact(
                    "SDFASDF#@#@#14123123",
                    "Jimmy",
                    "Hendrix",
                    "6461234567",
                    "123 Place Street"
            );
        });
        // firstName too long
        assertThrows(Exception.class, () -> {
            Contact contact = new Contact(
                    "A3G6A2A6D3",
                    "JimmyJohnYoloSwagOkLetsGo",
                    "Hendrix",
                    "6461234567",
                    "123 Place Street"
            );
        });
        // lastName too long
        assertThrows(Exception.class, () -> {
            Contact contact = new Contact(
                    "A3G6A2A6D3", // contactID too long
                    "Jimmy",
                    "JimmyJohnYoloSwagOkLetsGo",
                    "6461234567",
                    "123 Place Street"
            );
        });
        // phone too long
        assertThrows(Exception.class, () -> {
            Contact contact = new Contact(
                    "A3G6A2A6D3", // contactID too long
                    "Jimmy",
                    "Hendrix",
                    "6461234567234235123234",
                    "123 Place Street"
            );
        });
        // address too long
        assertThrows(Exception.class, () -> {
            Contact contact = new Contact(
                    "A3G6A2A6D3", // contactID too long
                    "Jimmy",
                    "Hendrix",
                    "6461234567",
                    "123 Place Street Yolo Swaggins Lane on tha block yo"
            );
        });
    }
}