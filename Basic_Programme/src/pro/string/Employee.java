package pro.string;

public final class Employee {
	private final String name;
	private final String lastName;
	private final double salary;
	private final Address address;
	
	Employee(String name, String lastName, double salary, Address address) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.salary = salary;
		Address a1=new Address();
		a1.setCity(address.getCity());
		a1.setPin(address.getPin());
		this.address=a1;
		
	}
	public String getName() {
		return name;
	}
	public String getLastName() {
		return lastName;
	}
	public double getSalary() {
		return salary;
	}
	public Address getAddress() {
		Address a2=new Address();
		a2.setCity(address.getCity());
		a2.setPin(address.getPin());
		return a2;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", lastName=" + lastName + ", salary=" + salary + ", address=" + address
				+ "]";
	}
	
	
	

}
