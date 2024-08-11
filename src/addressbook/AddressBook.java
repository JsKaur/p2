/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import java.util.ArrayList;


/**
 * An application that allows users to enter in a friend's address
 *  and stores it in an "address book". This code needs some work!
 * Your job is to turn it into code that uses a model, a view and a controller
 * @author dancye
 */
public class AddressBook {

   public static void main(String[] args) {
        AddressModel model = new AddressModel();
        AddressView view = new AddressView();
        AddressController controller = new AddressController(model, view);
        controller.run();
    }

	public static ArrayList<String> addressBook = new ArrayList<String>();
    
}
