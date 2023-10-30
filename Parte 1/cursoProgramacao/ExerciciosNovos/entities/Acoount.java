package entities;

import model.exceptions.DomainExceptions;

public class Acoount {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Acoount() {
	}
	
	public Acoount(Integer number, String holder, Double balance, Double withDrawLimit) {
		
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}
	
	public Integer getNumber() {
		return number;
	}
	
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public String getHolder() {
		return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public Double getWithDrawLimit() {
		return withDrawLimit;
	}
	
	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}
	
	 public void deposit(Double amount) {
		 balance += amount;
	 }
	
	public void withdraw(Double amount) {
		validateWithdraw(amount);
		balance -= amount;
	}
	
	private void validateWithdraw(Double amount) {
		if(withDrawLimit < amount) {
			throw new DomainExceptions("The amount exceeds withdraw limit");
		}
		if (balance < amount) {
			throw new DomainExceptions("Not enough balance");
		}
	}
	@Override
	public String toString() {
		return "New balance : " + balance;
	}
}
