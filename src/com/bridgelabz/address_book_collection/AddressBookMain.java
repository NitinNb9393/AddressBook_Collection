package com.bridgelabz.address_book_collection;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome into the Program of Address Book System !!");
		NewAddressBook book = new NewAddressBook();
		book.addContact();// Calling Add Contacts Method
		System.out.println(book.person);
		System.out.println("Enter the choice \n 1. Edit \n 2. Delete");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			book.editContact();
			System.out.println("You have Entered following data");
			System.out.println(book.person);
			System.out.println("Thank you for Using the Address book");
			break;
		case 2:
			book.deleteContact();
			System.out.println("Address Book details :" + book.person);
			break;
		}
	}
}