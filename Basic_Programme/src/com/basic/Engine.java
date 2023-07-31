package com.basic;
//deep clone
import java.util.Objects;

public class Engine implements Cloneable{
String name;
int num;
private Engine() {
	super();
	// TODO Auto-generated constructor stub
}
Engine(String name, int num) {
	super();
	this.name = name;
	this.num = num;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
@Override
public String toString() {
	return "Engine [name=" + name + ", num=" + num + "]";
}
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}



@Override
public int hashCode() {
	return Objects.hash(name, num);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Engine other = (Engine) obj;
	return Objects.equals(name, other.name) && num == other.num;
}
public static void main(String[] args)throws CloneNotSupportedException {
	Engine e=new Engine("4stroke",112);
	Vehicle v=new Vehicle("Bmw",1234,e);
	
	Vehicle v1=null;
	try {
		v1=(Vehicle)v.clone();
	} catch (CloneNotSupportedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	System.out.println("before change"+v);
	System.out.println("before change"+v1);
	
	v1.getE().setName("5 stroke");
	
	System.out.println("after change"+v);
	System.out.println("after change"+v1);
	

}
}
