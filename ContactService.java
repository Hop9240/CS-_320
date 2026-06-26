import java.util.ArrayList;
public class ContactService {
	//ArrayList created to store Contact objects
	private ArrayList<Contact> contacts = new ArrayList<Contact>();
	//Method created to add Contact with unique ID's
	public void addContact(String contactId, String firstName, String lastName, String phoneNumber,
			String address) {
		for(Contact contact : contacts) {
			if(contact.getContactId().equals(contactId)) {
				throw new IllegalArgumentException("invalid input");
			}
	
			}
		Contact newContact = new Contact(contactId, firstName, lastName, phoneNumber, address);
		contacts.add(newContact);
		}
	//Method created to Delete a stored contact with unique ID
	public void deleteContact(String contactId) {
		for(Contact contact : contacts) {
			if(contact.getContactId().equals(contactId)) {
				contacts.remove(contact);
				return;
			}
		}
		throw new IllegalArgumentException("invalid input");
	}
	//Method made to update stored contacts
	public void updateFirstName(String contactId, String firstName) {
		for(Contact contact : contacts) {
			if(contact.getContactId().equals(contactId)) {
				contact.setFirstName(firstName);
				return;
			}
		}
		throw new IllegalArgumentException("invalid input");
	}
	
	public void updateLastName(String contactId, String lastName) {
		for(Contact contact : contacts) {
			if(contact.getContactId().equals(contactId)) {
				contact.setLastName(lastName);
				return;
			}
		}
		throw new IllegalArgumentException("invalid input");
	}
	public void updatePhoneNumber(String contactId, String phoneNumber) {
		for(Contact contact : contacts) {
			if(contact.getContactId().equals(contactId)) {
				contact.setPhoneNumber(phoneNumber);
				return;
			}
		}
		throw new IllegalArgumentException("invalid input");
	}
	
	public void updateAddress(String contactId, String address) {
		for(Contact contact : contacts) {
			if(contact.getContactId().equals(contactId)) {
				contact.setAddress(address);
				return;
			}
		}
		
		throw new IllegalArgumentException("invalid input");
	}
	//getter method to return a contact in the contacts array list
	public Contact getContact(String contactId) {
		for(Contact contact : contacts) {
			if(contact.getContactId().equals(contactId)) {
				return contact;
				
			}
		}
		throw new IllegalArgumentException("invalid input");
	}
	}
	




















