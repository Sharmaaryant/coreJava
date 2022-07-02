package Oop;

public class Testaccounts {
public static void main(String[] args) {
	Accounts a = new Accounts();
	a.setNumber("12234567");
	a.setType("fixed");
	a.setBalance(400);
	a.deposite(5000);
	a.withdrawl(500);
	
	System.out.println(a.getNumber());
	System.out.println(a.getType());
	System.out.println(a.getBalance());
	
}}
