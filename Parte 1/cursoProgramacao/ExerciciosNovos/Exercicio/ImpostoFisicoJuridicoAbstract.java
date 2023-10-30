package Exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class ImpostoFisicoJuridicoAbstract {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double AnualIncome = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double HealthExpenditures = sc.nextDouble();
				list.add(new Individual(name, AnualIncome, HealthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, AnualIncome, numberOfEmployees));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		double sum = 0.0;
		for(TaxPayer taxpayer : list) {
			System.out.println(taxpayer.getName() + ": $ " + String.format("%.2f", taxpayer.tax()));
		}
		System.out.println();
		for(TaxPayer taxpayer : list) {
			sum += taxpayer.tax();
		}
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
		sc.close();
	}

}
