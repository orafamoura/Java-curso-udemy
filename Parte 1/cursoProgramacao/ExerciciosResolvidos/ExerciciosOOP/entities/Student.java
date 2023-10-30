package entities;

public class Student {

	public String name;
	public double noteA;
	public double noteB;
	public double noteC;

	public double finalNote() {
		return noteA + noteB + noteC;
	}
	public double missingPoints() {
		if (finalNote() < 60.0) {
		return 60.0 - finalNote();
		}
		else {
		return 0.0;
		}
	}
}
