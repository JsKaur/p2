package addressbook;

import java.util.ArrayList;
public class AddressModel {
    
    private ArrayList<String> addressBook;

    public AddressModel() {
        addressBook = new ArrayList<>();
    }

    public void addAddress(String address) {
        addressBook.add(address);
    }

    public ArrayList<String> getAddressBook() {
        return addressBook;
    }
}