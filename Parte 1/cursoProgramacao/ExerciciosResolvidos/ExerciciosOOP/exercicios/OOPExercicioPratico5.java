package exercicios;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class OOPExercicioPratico5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double deposit = 0;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		
		System.out.print("Is there na initial deposit(y/n)? ");
		char response = sc.next().charAt(0);	
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			deposit = sc.nextDouble();
		}
		Account account = new Account(number, holder, deposit);
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double amount = sc.nextDouble();
		account.deposit(amount);
		
		System.out.println("Updated account data:");
		System.out.println(account.toString());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		amount = sc.nextDouble();
		account.withdraw(amount);
		
		System.out.println("Updated account data:");
		System.out.println(account.toString());
		
		sc.close();
	}
}
