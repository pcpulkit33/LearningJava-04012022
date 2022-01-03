package day1;

public class DemoEmployeeGettersandSetters {

	public static void main(String[] args) {

		EmployeeGettersandsetters Pulkit = new EmployeeGettersandsetters();

		Pulkit.setSalary(6000);

		Pulkit.setBonus(4000);

		int salary = Pulkit.calculateSalary();

		System.out.println("Total salary of Pulkit is = " + salary);
	}

}
