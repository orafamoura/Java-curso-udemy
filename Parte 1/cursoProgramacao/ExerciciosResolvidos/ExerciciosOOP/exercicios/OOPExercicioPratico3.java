package exercicios;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class OOPExercicioPratico3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student;
		student = new Student();
		
		student.name = sc.nextLine();
		student.noteA = sc.nextDouble();
		student.noteB = sc.nextDouble();
		student.noteC = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f%n", student.finalNote());
		if (student.finalNote() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		sc.close();
	}
}