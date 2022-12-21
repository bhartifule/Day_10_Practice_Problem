package com.bridglabz;

import java.util.ArrayList;
import java.util.Scanner;

import com.bridglabz.Contact;

public class AddressBook {
    ArrayList<Contact> contactList = new ArrayList<>();


public void addContact() {
    Contact contactPerson = new Contact();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the details of contact person");
    System.out.print("Enter first name:");
    contactPerson.setFirstName(sc.next());
    System.out.print("Enter Last name:");
    contactPerson.setLastName(sc.next());
    System.out.println("Enter the Address : ");
    contactPerson.setAddress(sc.next());
    System.out.println("Enter the City : ");
    contactPerson.setCity(sc.next());
    System.out.println("Enter the State : ");
    contactPerson.setState(sc.next());
    System.out.println("Enter the ZipCode : ");
    contactPerson.setZipCode(sc.nextInt());
    System.out.println("Enter the Mobile no : ");
    contactPerson.setPhoneNo(sc.nextInt());
    contactList.add(contactPerson);
}


@Override
public String toString() {
	return "AddressBook [contactList=" + contactList + "]";
}


public void editContact() {
	Scanner sc = new Scanner(System.in);
    System.out.print("Enter first name:");
    String name = sc.next();
    for (Contact contactPerson : contactList) {
        if (name.equals(contactPerson.getFirstName())) {
            System.out.println("Set Details");
            System.out.print("Enter first name:");
            contactPerson.setFirstName(sc.next());
            System.out.print("Enter Last name:");
            contactPerson.setLastName(sc.next());
            System.out.println("Enter the Address : ");
            contactPerson.setAddress(sc.next());
            System.out.println("Enter the City : ");
            contactPerson.setCity(sc.next());
            System.out.println("Enter the State : ");
            contactPerson.setState(sc.next());
            System.out.println("Enter the ZipCode : ");
            contactPerson.setZipCode(sc.nextInt());
            System.out.println("Enter the Mobile no : ");
            contactPerson.setPhoneNo(sc.nextInt());
            break;
        }
        
    }
	
}


public void deleteContact() {
	// TODO Auto-generated method stub
	 Scanner sc = new Scanner(System.in);
     System.out.print("Enter first name:");
     String name = sc.next();
     for (Contact contactPerson : contactList) {
         if (name.equals(contactPerson.getFirstName())) {
             contactList.remove(contactPerson);
             break;
         }

     }
 }
}


