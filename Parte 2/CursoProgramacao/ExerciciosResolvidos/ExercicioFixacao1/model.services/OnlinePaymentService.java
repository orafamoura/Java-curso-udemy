package model.services;

public interface OnlinePaymentService {
	
	public default double paymentFee(Double amount) {	
		return amount * 0.02;
	}
	
	public default double interest(Double amount, int months) {
		return amount * 0.01 * months ;					
	}
}
