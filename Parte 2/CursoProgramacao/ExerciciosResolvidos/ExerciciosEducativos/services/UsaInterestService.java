package services;

public class UsaInterestService implements InterestService{

	private double interestRate; //taxa de juros

	public UsaInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override	
	public double getInterestRate() { //este metodo depende do valor da variavel que esta armazenada no servico
		return interestRate; 
	}		
}
