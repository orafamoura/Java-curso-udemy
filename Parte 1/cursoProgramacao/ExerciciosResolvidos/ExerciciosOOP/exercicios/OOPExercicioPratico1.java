package exercicios;

import java.util.Scanner;
import entities.Rectangle;
import java.util.Locale;

public class OOPExercicioPratico1 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle; 
		
		rectangle = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		rectangle.width = sc.nextDouble();
		rectangle.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%nPERIMETER = %.2f%nDIAGONAL = %.2f%n",rectangle.area(),rectangle.perimeter(),rectangle.diagonal());
		
		
		sc.close();
	}
}
