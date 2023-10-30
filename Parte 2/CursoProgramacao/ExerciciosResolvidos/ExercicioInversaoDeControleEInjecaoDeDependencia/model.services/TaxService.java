package model.services;

public interface TaxService {

	 default double tax(double amount) {
		return amount;
				
	}
	
	
}
