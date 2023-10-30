package services;

import java.security.InvalidParameterException;

public interface InterestService { //interface nao pode ter constructor
//interfaces sao diferentes de classes abstratas, pois nao tem o constructor e atributos
	double getInterestRate();
	
	//implementacao padrao, Defaultmethods, um metodo padrao de duas classes eu coloco dentro da interface e ao inves de public coloco default
	default double payment(double amount, int months) {
		if(months < 1) { //programacao defensiva, meses tem que ser maior que 0
			throw new InvalidParameterException("Months must be greater than zero");
		}
		return amount * Math.pow(1.0 + getInterestRate() / 100.0, months);
	}	
}
