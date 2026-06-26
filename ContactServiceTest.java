import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	//Test to make sure there is not an exception thrown if unique contact is created
	void testContactAdd() {
		ContactService service = new ContactService();
		assertDoesNotThrow(() ->{
			service.addContact("9240", "Howon", "Pottinger", "5739315328", "3555 S Cottage Grove");
		});
	}
	@Test
	//Test method to check if duplicate contacts can be created
	void testContactAddDuplicate() {
		ContactService service = new ContactService();
		service.addContact("9240", "Howon", "Pottinger", "5739315328", "3555 S Cottage Grove");
		
		assertThrows(IllegalArgumentException.class, () ->{
			service.addContact("9240", "Howon", "Pottinger", "5739315328", "3555 S Cottage Grove");
		});
	}
	
	@Test
	//Test method that makes sure there are no exceptions thrown when deleting contacts
	void testContactCanDelete() {
		ContactService service = new ContactService();
		service.addContact("9240", "Howon", "Pottinger", "5739315328", "3555 S Cottage Grove");
		
			service.deleteContact("9240");
			assertThrows(IllegalArgumentException.class, () ->{
				service.getContact("9240");
			
			
		});
	}
	@Test
	void testUpdateFirstName() {
		ContactService service = new ContactService();
		service.addContact("9240", "Howon", "Pottinger", "5739315328", "3555 S Cottage Grove");
		
		assertDoesNotThrow(() ->{
			service.updateFirstName("9240", "Dastarr");
			assertEquals("Dastarr", service.getContact("9240").getFirstName());
			
		});
	}
	
	@Test
	//Test method to validate last name change
	void testUpdateLastName() {
		ContactService service = new ContactService();
		service.addContact("9240", "Howon", "Pottinger", "5739315328", "3555 S Cottage Grove");
		
		assertDoesNotThrow(() ->{
			service.updateLastName("9240", "Dixon");
			assertEquals("Dixon", service.getContact("9240").getLastName());
		});
		
	}
	@Test
	//Test method to see if phone number updates successfully 
	void testUpdatePhoneNumber() {
		ContactService service = new ContactService();
		service.addContact("9240", "Howon", "Pottinger", "5739315328", "3555 S Cottage Grove");
		
		assertDoesNotThrow(() ->{
			service.updatePhoneNumber("9240", "7739241454");
			assertEquals("7739241454", service.getContact("9240").getPhoneNumber());
		});
	}
	
	@Test
	//Test method to see if Address updates successfully
	void testUpdateAddress() {
		ContactService service = new ContactService();
		service.addContact("9240", "Howon", "Pottinger", "5739315328", "3555 S Cottage Grove");
		
		assertDoesNotThrow(() ->{
			service.updateAddress("9240", "333 Petty Street");
			assertEquals("333 Petty Street", service.getContact("9240").getAddress());
		});
	}

}




















