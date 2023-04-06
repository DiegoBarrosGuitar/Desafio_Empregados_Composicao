package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String name;
	private int payDay;
	
	private List<Employee> employees = new ArrayList<>();
	
	public Department() {
	}

	public Department(String name, int payDay) {
		this.name = name;
		this.payDay = payDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayDay() {
		return payDay;
	}

	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}

	public List<Employee> getEmployee() {
		return employees;
	}
	
	 public void addEmployee(Employee employee) {
		 employees.add(employee);
	}
	 
	 public void removeEmployee(Employee employee) {
		 employees.remove(employee);
	}
	 
    public double payroll() {
		double sum = 0.0;
		for (Employee salary : employees) {
			sum += salary.getSalary();
		}
		return sum;
	}

	public Address getAddress() {
		return null;
	}

	public Address setAddress(Address address) {
		return address;
	}

}
