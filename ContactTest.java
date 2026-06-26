import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContactCreation() {
		//New Contact object created
		Contact contact = new Contact("773", "Dastarr", "Pottinger", "5739315328", "3555 s Cottage Grove");
		//Uses assertions to verify the object returns the same values passed into the constructor
		assertEquals("773", contact.getContactId());
		assertEquals("Dastarr", contact.getFirstName());
		assertEquals("Pottinger", contact.getLastName());
		assertEquals("5739315328", contact.getPhoneNumber());
		assertEquals("3555 s Cottage Grove", contact.getAddress());
		
	}
	//Test implemented to make sure that objects field matches its strict parameters
	@Test
	void testContactIdTooLong() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Contact("1773312708847", "Dastarr", "Pottinger", "5739315328", "3555 s Cottage Grove");
		});
	}
	@Test
	void testContactIdNull() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Contact(null,"Dastarr", "Pottinger", "5739315328", "3555 s Cottage Grove" );
		});
	}
	@Test
	void testContactFirstNameTooLong() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Contact("773", "Dastarrington", "Pottinger", "5739315328", "3555 s Cottage Grove");
		});
	}
	@Test
	void testContactFirstNameNull() {
		assertThrows(IllegalArgumentException.class, ()->{
			new Contact("773", null, "Pottinger", "5739315328", "3555 s Cottage Grove");
		});
	}
	
	@Test
	void testContactLastNameTooLong() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Contact("773", "Dastarr", "Pottingerrs", "5739315328", "3555 s Cottage Grove");
		});
	}
	@Test
	void testContactLastNameNull() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Contact("773", "Dastarr", null, "5739315328", "3555 s Cottage Grove");
		});
	}
	@Test
	void testContactPhoneNumberTooShort() {
		assertThrows(IllegalArgumentException.class, ()->{
			new Contact("773", "Dastarr", "Pottinger", "57393153", "3555 s Cottage Grove");
		});
	}
	@Test
	void testContactPhoneNumbetTooLong() {
		assertThrows(IllegalArgumentException.class, () ->{
			new Contact("773", "Dastarr", "Pottinger", "573931532898", "3555 s Cottage Grove");
		});
		
	}
	
	@Test
	void testPhoneNumberNull() {
		assertThrows(IllegalArgumentException.class, ()->{
			new Contact("773", "Dastarr", "Pottinger", null, "3555 s Cottage Grove");
		});
	}
	
	@Test
	void testAddressTooLong() {
		assertThrows(IllegalArgumentException.class, ()->{
			new Contact("773", "Dastarr", "Pottinger", "5739315328", "3555 s Cottage Grove and 3555 s king drive");
		});
	}
	@Test
	void testAddressNull() {
		assertThrows(IllegalArgumentException.class, ()->{
			new Contact("773", "Dastarr", "Pottinger", "5739315328", null);
		});
	}
	
	@Test
	void testPhoneDigits() {
		assertThrows(IllegalArgumentException.class, ()->{
			new Contact("773", "Dastarr", "Pottinger", "773abc6091", "3555 s Cottage Grove");
		});
	}

}



















