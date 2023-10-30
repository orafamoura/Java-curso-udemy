package entities;

public class Height {

	private String name;
	private int age;
	private double heigt;
	
	public Height(String name, int age, double heigt) {
		this.name = name;
		this.age = age;
		this.heigt = heigt;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeigt() {
		return heigt;
	}
	public void setHeigt(double heigt) {
		this.heigt = heigt;
	}
}
