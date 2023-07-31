package com.basic;//shallow clone

import java.util.Objects;

public class Student implements Cloneable {
int id;
String name;
Address address;
private Student() {
	super();
	// TODO Auto-generated constructor stub
}
private Student(int id, String name, Address address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public int hashCode() {
	return Objects.hash(address, id, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	return Objects.equals(address, other.address) && id == other.id && Objects.equals(name, other.name);
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
}


public static void main(String[] args) throws CloneNotSupportedException {
	Address a=new Address("Pune",1234);
	Student s=new Student(11,"Marish",a);
	
	Student s1=null;
	
	s1=(Student)s.clone();
	System.out.println("before city change"+s);
	System.out.println("before city change"+s1);
	
	s.getAddress().setCity("mumbai");
	System.out.println("after city change"+s);
	System.out.println("after city change"+s1);
}
}
