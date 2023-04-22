package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import projectpackage.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("Jhariel","Almonte","1112223333","111 Stellar Av. Moon", "123456");
		assertTrue(contact.getFirstName().equals("Jhariel"));
		assertTrue(contact.getLastName().equals("Almonte"));
		assertTrue(contact.getNumber().equals("1112223333"));
		assertTrue(contact.getAddress().equals("111 Stellar Av. Moon"));
		assertTrue(contact.getContactId().equals("123456"));
	}
	
	@Test
	void testContactValidInput() {
	
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(null,"Almonte","1112223333","111 Stellar Av. Moon, Milky Way", null);
		});
	}
	
	

}
