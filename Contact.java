package contact;

public class Contact {
    private String contactID;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact(
        String contactID, String firstName, String lastName, 
        String phone, String address) throws Exception {
        setContactID(contactID);
        setFirstName(firstName);
        setLastname(lastName);
        setPhone(phone);
        setAddress(address);
    }

    public String getContactID() {
        return contactID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    private void setContactID(String contactID) throws Exception {
        if (contactID == null || contactID.length() == 0 || contactID.length() > 10) {
            throw new Exception("contactID must be between 1-10 characters");
        }
        this.contactID = contactID;
    }

    public void setFirstName(String firstName) throws Exception {
        if (firstName == null || firstName.length() == 0 || firstName.length() > 10) {
            throw new Exception("firstName must be between 1-10 characters");
        }
        this.firstName = firstName;
    }

    public void setLastname(String lastName) throws Exception {
        if (lastName == null || lastName.length() == 0 || lastName.length() > 10) {
            throw new Exception("lastName must be between 1-10 characters");
        }
        this.lastName = lastName;
    }

    public void setPhone(String phone) throws Exception {
        if (phone == null || phone.length() == 0 || phone.length() > 10) {
            throw new Exception("phone must be between 1-10 characters");
        }
        this.phone = phone;
    }

    public void setAddress(String address) throws Exception {
        if (address == null || address.length() == 0 || address.length() > 30) {
            throw new Exception("address must be between 1-30 characters");
        }
        this.address = address;
    }
}
