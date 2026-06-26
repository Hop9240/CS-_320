//Fields to store contact information
public class Contact {
	private String contactId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	//Constructor receives Contact information and stores it along with its limits in the field
	public Contact(String contactId, String firstName, String lastName, String phoneNumber,
			String address) {
		if(contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("invalid input");
		}
		else {
			this.contactId = contactId;
		}
		
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("invalid input");
		}
		else {
			this.firstName = firstName;
		}
		
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("invalid input");
		}
		else {
			this.lastName = lastName;
		}
		/*If statement that sets the parameters to be stored in the phoneNumber field along with a method that
		 Changes the phone number string to digits */	
		if(phoneNumber == null || phoneNumber.length() != 10 || !phoneNumber.matches("[0-9]+")) {
			throw new IllegalArgumentException("invalid input");
		}
		else {
			this.phoneNumber = phoneNumber;
		}
		
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("invalid input");
		}
		else {
			this.address = address;
		}
	}
	//getter methods that return the class fields
	public String getContactId() {
		return this.contactId;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public String getAddress() {
		return this.address;
	}
	//Setter methods created with strict parameters for that field
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.length() > 10 ) {
			throw new IllegalArgumentException("invalid input");
		}
		else {
			this.firstName = firstName;
		}
	}
	
	public void setLastName(String lastName) {
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("invalid input");
		}
		else {
			this.lastName = lastName;
		}
		
	}
	
	public void setPhoneNumber(String phoneNumber) {
		if(phoneNumber == null || phoneNumber.length() !=10 || !phoneNumber.matches("[0-9]+")) {
			throw new IllegalArgumentException("invalid input");
		}
		else {
			this.phoneNumber = phoneNumber;
		}
	}
	public void setAddress(String address) {
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("invalid input");
		}
		else {
			this.address = address;
		}
	}
}






























