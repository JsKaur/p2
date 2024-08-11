package addressbook;

import java.util.Scanner;

import java.util.ArrayList;
public class AddressView {
    
    private Scanner scanner;

    public AddressView() {
        scanner = new Scanner(System.in);
    }

    public String getNewAddress() {
        System.out.println("Please enter a new address:");
        return scanner.nextLine();
    }

    public String getUserChoice() {
        System.out.println("Press 1 to enter another address or 0 to quit:");
        return scanner.nextLine();
    }
    
    public void displayAddress(ArrayList<String> addressBook) {
        System.out.println("Your address book contains following listing: ");
        for (String address : addressBook) {
            System.out.println(address);
        }
    }
}