package cursoProgramacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcecoesTryCatchFinally {

	public static void main(String[] args) {
		
		method1();
		System.out.println("End of program!");
	}
	
	public static void method1() {
		System.out.println("***METHOD 1 START***");
		
		method2();
		
		System.out.println("***METHOD 1 END***");
		
	}
	
	public static void  method2() {
		
		System.out.println("***METHOD 2 START***");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			}
			catch(ArrayIndexOutOfBoundsException e) { // ArrayIndexOutOfBoundsException posicao fora do limite
				System.out.println("Invalid position!");
				//e.printStackTrace(); // stack trace mostra o caminho das excecoes error 
				//sc.next();
			}
			catch(InputMismatchException e) { // InputMismatchException valor invalido para o inteiro
				System.out.println("Input Error");
			}
			finally { //independente do codigo ser executado ou nao o finally aparece
				System.out.println("***Finally block executed***");
				sc.close();	
				
			}
		System.out.println("***METHOD 2 END***");
		System.out.println("***Finally block executed***");
		
	}
}


