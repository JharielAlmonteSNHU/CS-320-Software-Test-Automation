package projectpackage;

import java.util.ArrayList;

public class ContactService {
	
	private ArrayList<Contact> contactList = new ArrayList<Contact>();
	
	
	public ContactService() {}
	
	public boolean addContact(Contact contact) {
		
		contactList.add(contact);
		return true;
		 
	}
	public boolean deleteContact(Contact contact) {
		
		for(Contact n : contactList) {
			if(n.getContactId().equals(contact.getContactId())){
				contactList.remove(n);
				return true;
			}
		}
		return false;
	}
	public boolean updateContact(Contact contact, String firstName, String lastName, String number, String address) {
		for(Contact c : contactList) {
			if(c.getContactId().equals(contact.getContactId())) {
				c.setFirstName(firstName);
				c.setLastName(lastName);
				c.setNumber(number);
				c.setAddress(address);
				
				return true;
			}
		}
		return false;
	}
	public boolean hasContact(Contact contact) {
		 
		return contactList.contains(contact);
	}
	public String getContactID(Contact contact) {
		for(Contact n : contactList) {
			if(n.getContactId().equals(contact.getContactId())) {
				return n.getContactId();
			}
		}
		return "";
	}
}
