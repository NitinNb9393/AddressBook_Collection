package com.bridgelabz.address_book_collection;

public class ContactDetails {
	private String firstName;
	private String lastName;
	private String addressCity;
	private String state;
	private int zip;
	private long phoneNumber;
	private String email;

	public ContactDetails(String firstName, String lastName, String addressCity, String state, String email, Long zip,
			Long phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.addressCity = addressCity;
		this.state = state;
		this.email = email;
		this.zip = Math.toIntExact(zip);
		this.phoneNumber = phoneNumber;
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

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public int getPhoneNumber() {
		return (int) phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "firstName= " + firstName + '\'' + "lastName=" + lastName + '\'' + "addressCity=" + addressCity + '\''
				+ "state=" + state + '\'' + "email=" + email + '\'' + "zip=" + zip + '\'' + "phoneNumber=" + phoneNumber
				+ '\'';

	}
}