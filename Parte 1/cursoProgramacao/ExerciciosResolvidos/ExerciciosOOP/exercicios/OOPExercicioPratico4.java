package exercicios;

import java.util.Locale;
import java.util.Scanner;
import entities.CurrencyConverter;

public class OOPExercicioPratico4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		CurrencyConverter currencyConverter = new CurrencyConverter();
		
		System.out.print("What is the dollar price? ");
		currencyConverter.dolar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		currencyConverter.quantity = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f%n",currencyConverter.totalAmountIOF());
		sc.close();
	}

}
