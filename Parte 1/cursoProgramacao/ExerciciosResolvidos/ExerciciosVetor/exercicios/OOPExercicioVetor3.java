package exercicios;

import java.util.Locale;
import java.util.Scanner;
import entities.Height;

public class OOPExercicioVetor3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int quantP = sc.nextInt();
		Height[] vect = new Height[quantP];
		
		String [] name = new String[quantP];
		int[] age = new int[quantP];
		double[] heigt = new double[quantP];
		
		for(int i=0; i<quantP;i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();			
			name[i] = sc.nextLine();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
			System.out.print("Altura: ");
			heigt[i] = sc.nextDouble();
		}
		
		double result = 0.0;
		for(int i=0;i<quantP;i++) {
			result = result + heigt[i];
		}
		System.out.printf("Altura media: %.2f%n",result / quantP);
			
		int aux = 0;
		for(int i=0;i<quantP;i++) {
			if(age[i] < 16) {
				aux = aux + 1;
			}
		}
		
		double percent = aux * 100.0 / quantP;
		System.out.println("Pessoas com menos de 16 anos: " + percent + "%");
		
		for(int i=0;i<quantP;i++) {
			if(age[i]< 16) {
				System.out.println(name[i]);
			}
		}
		sc.close();
	}
}
