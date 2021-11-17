package com.bridgelabz.address_book_collection;

public class AddressBookMain {
	public static void main(String[] args) {
		System.out.println("Welcome into the Program of Address Book System ");
		ContactDetails newContact = new ContactDetails();
		newContact.setFirstName("Nitin\n");
		newContact.setLastName("Babar\n");
		newContact.setAddressCity("karad\n");
		newContact.setState("Maharashtra\n");
		newContact.setEmail("nitinbabar9393@gmail.com");
		newContact.setZip(415305);
		newContact.setPhoneNumber(8237259393L);
		System.out.println("The Contact is :\n" + newContact);

	}
}
