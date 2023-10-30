package cursoProgramacao;

import java.util.Scanner;
import entities.Calculator;

public class OOPMembrosEstaticos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius); // para dados estaticos, fixos, que nao mudam, eu posso colocar o static no nome, e com isso 
// nao preciso instanciar ( Calculator calculator = new Calculator();)
// pra falar que o PI e uma constante nao uma variavel se coloca a palavra final depois do static;public static final NOME_EM_MAIUSCULO_COM_ANDERLINE
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);

		sc.close();
	}

}
