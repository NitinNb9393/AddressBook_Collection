package com.bridgelabz.address_book_collection;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome into the Program of Address Book System !!");
		NewAddressBook book = new NewAddressBook();
		book.getMenu();
		book.showContact();
	}
}