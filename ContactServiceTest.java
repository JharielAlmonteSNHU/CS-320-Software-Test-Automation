package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import projectpackage.Contact;
import projectpackage.ContactService;

class ContactServiceTest {

	@Test
	void testAddNewContact() {
		Contact contact = new Contact("Jhariel","Almonte","1112223333","111 Stellar Av. Moon", "123456");
		ContactService service = new ContactService();
		
		service.addContact(contact);
		assertTrue(service.hasContact(contact));
			
	}
	@Test
	void testDeleteContact() {
		Contact contact = new Contact("Jhariel","Almonte","1112223333","111 Stellar Av. Moon", "123456");
		ContactService service = new ContactService();
		
		service.addContact(contact);
		assertTrue(service.hasContact(contact));
		
		service.deleteContact(contact);
		assertFalse(service.hasContact(contact));
		
		
	}
	@Test
	void testUpateContact() {
		Contact contact = new Contact("Jhariel","Almonte","1112223333","111 Stellar Av. Moon", "123456");
		ContactService service = new ContactService();
		
		service.addContact(contact);
		assertTrue(service.hasContact(contact));
		
		service.updateContact(contact, "Jack", "Sparrow", "4445556666", "134 Polar St. Earth");
		assertTrue(contact.getFirstName().equals("Jack"));
		
	}
	
}
