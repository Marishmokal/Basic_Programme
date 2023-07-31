package com.basic;
//deep clone
import java.util.Objects;

public class Vehicle implements Cloneable {
String name;
int price;
Engine e;
private Vehicle() {
	super();
	// TODO Auto-generated constructor stub
}
Vehicle(String name, int price, Engine e) {
	super();
	this.name = name;
	this.price = price;
	this.e = e;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Engine getE() {
	return e;
}
public void setE(Engine e) {
	this.e = e;
}
@Override
protected Object clone() throws CloneNotSupportedException {
	Vehicle edummy=(Vehicle)super.clone();
	edummy.setE((Engine)edummy.getE().clone());
	return edummy;
	
	
}
@Override
public int hashCode() {
	return Objects.hash(e, name, price);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Vehicle other = (Vehicle) obj;
	return Objects.equals(e, other.e) && Objects.equals(name, other.name) && price == other.price;
}



}
