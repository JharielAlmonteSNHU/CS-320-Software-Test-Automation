package projectpackage;

public class Contact {
	
	private String firstName;
	private String lastName;
	private String number;
	private String address;
	
	private String contactId;
	 

	public Contact(String firstName, String lastName, String number, String address, String contactId) {
		
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid input, must be less than 10 characters");
		}
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid input, must be less than 10 characters");
		}
		if(contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Invalid input, must be less than 10 characters");
		}
		if(number == null || number.length() != 10) {
			throw new IllegalArgumentException("Invalid input, must be exactly 10 characters");
		}
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid input, must be less than 30 characters");
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.address = address;
		this.contactId = contactId;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactId() {
		return contactId;
	}

	
	
	

}
