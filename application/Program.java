package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		System.out.print("Nome do departamento: ");
		String deptName = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Telefone: ");
		String phone = sc.nextLine();
		
		
		Department dept = new Department(deptName, payDay);
		Address address = new Address(email, phone);
		dept.setAddress(address);
		

		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		
		for (int i = 1; i <= n; i++) {
			System.out.printf("Dados do funcionário %d:\n", i);
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			sc.nextLine();
			Employee emp = new Employee(name, salary);
			dept.addEmployee(emp);
		}
		
		showReport(dept);
		
		sc.close();
	}
	
	private static void showReport(Department dept) {
		System.out.printf("FOLHA DE PAGAMENTO:\nDepartamento %s = R$ %.2f\nPagamento realizado no dia %d\n", 
				dept.getName(), dept.payroll(), dept.getPayDay());
		System.out.println("Funcionários:");
		for (Employee emp : dept.getEmployee()) {
			System.out.println(emp.getName());
		}
		System.out.printf("Para dúvidas favor entrar em contato: %s\n", dept.getAddress().getEmail());
	}
}
