package com.javaeight;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class EmployeeTest {
public static void main(String[] args) {
	
	Employee e1=new Employee("ganesh","HR",7272);
	Employee e2=new Employee("ram","Accounts",4500);
	Employee e3=new Employee("vidya","IT",14200);
	Employee e4=new Employee("john","IT",15700);
	Employee e5=new Employee("max","networking",3300);
	Employee e6=new Employee("elliy","opertaion",7300);
	
	
	List<Employee>employee=new ArrayList<>();
	employee.add(e6);
	employee.add(e5);
	employee.add(e4);
	employee.add(e3);
	employee.add(e2);
	employee.add(e1);
	
	
	//salary greater than 10000
	List<Employee> collect = employee.stream().filter(Employee->Employee.getSalary()>10000).collect(Collectors.toList());
	System.out.println(collect);
	
	//sum of salary
	double sum = employee.stream().mapToDouble(Employee::getSalary).sum();
	System.out.println(sum);
	
	//max salary
	OptionalDouble max = employee.stream().mapToDouble(Employee::getSalary).max();
	System.out.println(max);
	
	//min salary
	OptionalDouble min = employee.stream().mapToDouble(Employee::getSalary).min();
	System.out.println(min);
	
	//average salary
	OptionalDouble average = employee.stream().mapToDouble(Employee::getSalary).average();
	System.out.println(average);
	
	//sort by salary
	List<Employee> collect2 = employee.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).collect(Collectors.toList());
	System.out.println(collect2);
	
	//sort by name
	List<Employee> collect3 = employee.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
	System.out.println(collect3);
	
	//sort by department
	List<Employee> collect4 = employee.stream().sorted(Comparator.comparing(Employee::getDepartment)).collect(Collectors.toList());
	System.out.println(collect4);
	
	//departmetnt with HR
	List<Employee> collect5 = employee.stream().filter(Employee->Employee.getDepartment()=="IT").collect(Collectors.toList());
	System.out.println(collect5);
	
}

}
