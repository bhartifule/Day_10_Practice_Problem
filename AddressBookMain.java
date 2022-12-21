package com.bridglabz;

import java.util.HashMap;
import java.util.Scanner;

import com.bridglabz.AddressBook;

public class AddressBookMain {
	static  HashMap<String,AddressBook> addressBookMap=new HashMap<>();
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");

		AddressBook familyAdreesBook=new AddressBook();
	    System.out.println("WelCome To AddressBook Program");
	    Scanner scanner = new Scanner(System.in);
	    int opration;
	    do {
	        System.out.println("1. ADD CONTACT \n2. DISPLAY CONTACT \n3 EDIT \n4 Delete \n5. EXIT ");
	        System.out.println("Enter the Operation Number");
	        opration = scanner.nextInt();
	        switch (opration) {
	            case 1:
	            	familyAdreesBook.addContact();
	                break;
	            case 2:
	                System.out.println(familyAdreesBook);
	                break;
	            case 3:
	            	familyAdreesBook.editContact();
	                break;
	            case 4:
	            	familyAdreesBook.deleteContact();
	                break;
	            case 5:
	                System.out.println("Exiting");
	                break;
	            default:
	                System.out.println("Enter The Wrong Opration Number");
	        }
	    } while (opration != 5);
	

	//familyAdreesBook.addContact();
	//System.out.println(familyAdreesBook);
	//familyAdreesBook.editContact();
	//System.out.println(familyAdreesBook);
	//familyAdreesBook.deleteContact();


}
}
