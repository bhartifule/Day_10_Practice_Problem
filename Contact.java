package com.bridglabz;

public class Contact {
	String FirstName;
	String LastName;
	String Address;
	String City;
	String State;
	int zipCode;
	int PhoneNo;
	String Email;
	public Contact(String firstName, String lastName, String adress, String city, String state, int zip,
			int phoneNo, String email) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Address = Address;
		this.City = City;
		this.State = State;
		this.zipCode = zipCode;
		this.PhoneNo = PhoneNo;
		this.Email = Email;
	}
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public int getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		PhoneNo = phoneNo;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

	@Override
	public String toString() {
		return "Contact [FirstName=" + FirstName + ", LastName=" + LastName + ", Address=" + Address + ", City=" + City
				+ ", State=" + State + ", zipCode=" + zipCode + ", PhoneNo=" + PhoneNo + ", Email=" + Email + "]";
	}
	
	
}
