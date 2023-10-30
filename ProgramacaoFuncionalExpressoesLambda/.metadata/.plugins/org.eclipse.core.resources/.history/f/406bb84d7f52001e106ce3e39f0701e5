package application;

import java.util.Scanner;

import services.PrintService;

public class GenericsExemplo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>(); //com o tipo generics, a classe fica aberta para qualquer tipo, tendo que classificar aqui<Integer, String etc>
		
		System.out.print("how many values: ");
		int n = sc.nextInt();
		
		for(int i = 0; i< n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		//com o TypeSafety nao preciso fazer um casting
		//Object aceita qualquer tipo de variavel, mas o problema vai ser o tipeSafety
		// Integer x = (Integer)ps.first(); //ele nao pode converter so fazendo um casting
		System.out.println("First: " + ps.first());
		
		
		
		
		sc.close();
	}

}
