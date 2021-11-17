package com.bridgelabz.address_book_collection;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome into the Program of Address Book System !!");
		NewAddressBook person = new NewAddressBook();
		person.addContact();
		System.out.println("Enter Y To Edit The Contact");
		String op = sc.nextLine();
		if (op.equals("y") || op.equals("Y")) {
			person.editContact(); // Calling The Edit Contact Method
			System.out.println("You have Entered following data");
			System.out.println("The Contact Details After Editing : " + person);
		}
	}
}