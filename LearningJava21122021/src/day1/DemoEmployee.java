package day1;

public class DemoEmployee {

	public static void main(String[] args) {
		
		Employee Gaurav = new Employee(2000,2000);
		Gaurav.calculateSalary();
		System.out.println("----------------------------");
		
		Employee Pulkit;
		Pulkit = new Employee();

		Pulkit.salary = 20000;
		Pulkit.bonus = 2000;

		Pulkit.calculateSalary();

		Employee Deepak = new Employee();

		Deepak.salary = 30000;
		Deepak.bonus = 5000;

		int salary = Deepak.calculateSalary1();

		System.out.println("Deepak Salary is - " + salary);

		Employee Akash = new Employee();
		int salary1 = Akash.calculateSalary(10000, 500);
		System.out.println("Akash Salary is - " + salary1);
	}
}
