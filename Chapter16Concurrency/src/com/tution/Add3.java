package com.tution;

public class Add3 {
	private StringBuffer street;
	private String city;
	private int pincode;
	public StringBuffer getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = new StringBuffer(street);
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
