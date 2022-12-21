package com.bridglabz;



public class AddressBookMain {
public static void main(String[] args) {
	System.out.println("Welcome to Address Book Program");
	AddressBook familyAdreesBook=new AddressBook();

	familyAdreesBook.addContact();
	System.out.println(familyAdreesBook);
}
}
