package cursoProgramacao;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class HerancaPolimorfismoSobreposicaoSuperFinal {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		//UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003,"bob",0.0,200.0);
		Account acc3 = new SavingsAccount(1004, "Anna",0.0,0.01);
		
		//DOWNCASTING
		
		//BusinessAccount acc4 = acc2; da erro pois business account e account mas nao o contrario
		BusinessAccount acc4 = (BusinessAccount)acc2; //fazendo um casting manual () ai eu forco a superclass para subclass
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3;
		//acc3 e uma SavingsAccount, entao ela nao e uma BusinessAccount, entao nao e permitido, ele so entende na hora de executar, por isso nao aparece erro
		//donwcasting nem sempre vai dar certo, e por iss tem que testar
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		Account acc6 = new Account(1001, "Alex", 1000.0);  // override, sobreposicao, aqui deve dar 795,00 pois uma conta normal
		acc6.withdraw(200.0);
		System.out.println(acc6.getBalance());
		
		Account acc7 = new SavingsAccount(1001, "Alex", 1000.0,0.01); // override, sobreposicao, aqui deve dar 800,00 pois uma conta business
		acc7.withdraw(200.0);
		System.out.println(acc7.getBalance());
		
		Account acc8 = new BusinessAccount(1001, "Alex", 1000.0,500.0); // override, sobreposicao, aqui deve dar 800,00 pois uma conta business
		acc8.withdraw(200.0);
		System.out.println(acc8.getBalance());
		
		
		//POLIMORFISMO
		
		Account x = new Account(1020,"Alex",1000.0);
		Account y = new SavingsAccount(1020,"Alex",1000.0,0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		
		
		
	}

}
