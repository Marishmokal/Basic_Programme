package com.basic;//shallow clone

public class Address implements Cloneable {

	String city;
	int pin;
	Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	Address(String city, int pin) {
		super();
		this.city = city;
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pin=" + pin + "]";
	}
	
	
}
