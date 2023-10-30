package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxServices;
import model.services.RentalServices;

public class UsandoInterfaces {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.println("Retirada (dd/MM/yyyy HH:mm) :");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.println("Retorno (dd/MM/yyyy HH:mm) :");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);		
		CarRental cr = new CarRental(start, finish, new Vehicle(carModel));
		
		System.out.print("Entre com o preco por hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preco por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalServices rentalServices = new RentalServices(pricePerHour, pricePerDay, new BrazilTaxServices());
		//acoplamento fraco, agora somente mudo BrazilTaxService para outro quando precisar de uma tax diferente, ex: USTaxServices etc.
		//ao inves de entrar na classe RentalService e na Brazil
		rentalServices.processInvoice(cr);
		
		System.out.println("FATURA: ");
		System.out.println("Pagamento basico: " + cr.getInvoice().getBasicPayment());
		System.out.println("Imposto: " + cr.getInvoice().getTax());
		System.out.println("Pagamento total: " + cr.getInvoice().getTotalPayment());
		sc.close();
	}

}
