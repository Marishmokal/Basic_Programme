package pro.string;

public class TestImmutability {
public static void main(String[] args) {
	Address ad=new Address("pune",1452);
	Employee e=new Employee("Marish","Mokal",7852,ad);
	System.out.println(e);
	ad.city="mumbai";
	System.out.println(e);
}
}
