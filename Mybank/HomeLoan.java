package Mybank;

public class HomeLoan {
public static void main(String[] args) {
	Bank bank = new Bank();
	Bank b =  bank.getBank(2);	
	System.out.println("InterestRate is  " + b.interestRate() + " in " + b.getName());
}
}
