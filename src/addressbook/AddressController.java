package addressbook;

public class AddressController {
    
    private AddressModel model;
    private AddressView view;

    public AddressController(AddressModel model, AddressView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        boolean keepGoing = true;
        while (keepGoing) {
            String address = view.getNewAddress();
            model.addAddress(address);
            String userAnswer = view.getUserChoice();
            if (Integer.parseInt(userAnswer) != 1) {
                keepGoing = false;
            }
        }
        view.displayAddress(model.getAddressBook());
    }
}