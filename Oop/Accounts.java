package Oop;

import java.security.PublicKey;

public class Accounts {
private String number;
private String type;
private  double balance;
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public void deposite(int d) {
	double total = getBalance() + d;
	setBalance(total);
}
public void withdrawl(int w) {
	double total = getBalance() - w;
	setBalance(total);
	
}







}
