package entities;

public class CurrencyConverter {

	
	public double dolar;
	public double quantity;
	public static double iof = 0.06;
	
	public double totalAmount() {
		return dolar * quantity * iof;
	}
	public double totalAmountIOF() {
		return dolar * quantity + totalAmount();
	}
	
	
	
	
	
	
}
