package entities;

public class EmployeeInterComp implements Comparable<EmployeeInterComp> {
	private String name;
	private Double salary;

	public EmployeeInterComp(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(EmployeeInterComp other) { //compara um objeto com outro
		return name.compareTo(other.getName()); //compara o nome dos funcionarios
		// return salary.compareTo()other.getSalary()); //comaparar o salario
	}
}
