package day1;

public class EmployeeGettersandsetters {

	private int salary;

	private int bonus;

	// read access
	public int getSalary() {
		return salary;
	}

	// write access
	public void setSalary(int salary) {
		if (salary > 0)
			this.salary = salary;
	}

	// read access
	public int getBonus() {
		return bonus;
	}

	// write access
	public void setBonus(int bonus) {
		if (bonus > 0)
			this.bonus = bonus;
	}

	int calculateSalary() {
		int totalsalary = salary + bonus;
		return totalsalary;
	}

}
