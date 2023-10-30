package Exercicio;

import java.util.Locale;
import java.util.Scanner;

import entities.Acoount;
import model.exceptions.DomainExceptions;

public class SaqueExcecoes {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withDrawLimit = sc.nextDouble();
		Acoount acoount = new Acoount(number, holder, balance, withDrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		
		try {
		acoount.withdraw(sc.nextDouble()); 
		System.out.println("New balance: " + String.format("%.2f",acoount.getBalance()));
		}
		catch(DomainExceptions e){
			System.out.println("Withdraw error: " + e.getMessage());
		}
		sc.close();
	
	}

}
