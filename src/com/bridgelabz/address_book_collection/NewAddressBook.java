package com.bridgelabz.address_book_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class NewAddressBook {
	public String name;
	Scanner sc = new Scanner(System.in);

	public NewAddressBook(String name) {
		this.name = name;
	}

	public ArrayList<ContactDetails> getAddressBook() {
		return contactList;
	}

	ArrayList<ContactDetails> contactList = new ArrayList<>();

	public boolean checkDuplicateEntry(ContactDetails contact) {
		boolean check = false;
		for (ContactDetails duplicateEntry : contactList) {
			if (duplicateEntry.equals(contact)) {
				check = true;
			} else {
				check = false;
			}
		}
		return check;
	}

	public boolean addContact(ContactDetails contact) {
		boolean entryCheck = checkDuplicateEntry(contact);
		if (!entryCheck) {
			contactList.add(contact);
			System.out.println("Contact added successfully!!");
		} else {
			System.out.println("The person already exists!!!");
		}
		System.out.println("Address Book Data : " + contactList);
		return true;
	}

	public void editContact(String firstName) {
		System.out.println(" Enter the first name of the contact : ");
		String checkName;
		Integer choice;
		for (ContactDetails contact : contactList) {
			checkName = contact.getFirstName();
			if (firstName.equalsIgnoreCase(checkName)) {
				do {
					System.out.println("1. Edit First name" + "\n" + "2. Edit Last name" + "\n" + "3. Edit Address "
							+ "\n" + "4. Edit City " + "\n" + "5. Edit State" + "\n" + "6. Edit Zipcode " + "\n"
							+ "7. Edit Phone Number" + "\n" + "8. Edit Email" + "0. EXIT" + "\n"
							+ "Enter your choice :");
					choice = sc.nextInt();
					switch (choice) {
					case 1:
						System.out.println("Enter new first name:");
						String newFirstName = sc.next();
						contact.setFirstName(newFirstName);
						System.out.println(contact);
						break;
					case 2:
						System.out.println("Enter new last name:");
						String newLastName = sc.next();
						contact.setLastName(newLastName);
						System.out.println(contact);
						break;
					case 3:
						System.out.println("Enter new address:");
						String newAddress = sc.next();
						contact.setAddressCity(newAddress);
						System.out.println(contact);
						break;
					case 5:
						System.out.println("Enter new state:");
						String newState = sc.next();
						contact.setState(newState);
						System.out.println(contact);
						break;
					case 6:
						System.out.println("Enter new zipcode:");
						String newZipcode = sc.next();
						contact.setZip(newZipcode);
						System.out.println(contact);
						break;
					case 7:
						System.out.println("Enter new phone number :");
						String newPhone = sc.next();
						contact.setPhoneNumber(newPhone);
						System.out.println(contact);
						break;
					case 8:
						System.out.println("Enter new email id:");
						String newEmail = sc.next();
						contact.setEmail(newEmail);
						System.out.println(contact);
						break;
					}
				} while (!choice.equals(0));
				System.out.println(contact);
			} else {
				System.out.println("There is no contact named  " + firstName + ". Try Again !!");
			}
		}
	}

	public void deleteContact(String firstName) {
		String checkName2;
		for (ContactDetails contact : contactList) {
			checkName2 = contact.getFirstName();
			System.out.println(checkName2);
			if (firstName.equalsIgnoreCase(checkName2)) {
				try {
					contactList.remove(contact);
					System.out.println("Contact name " + firstName + "deleted successfully from the contact list");
				} catch (Exception e) {
					System.out.println("No any user belongs to this " + firstName + "  Try Again !!");
				}
			}
		}
	}
}