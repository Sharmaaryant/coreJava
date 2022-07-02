package in.co.rays.mypackagebank;

public class Bank {
	
private double interestRate;
private String  SBI;

public Bank () {
	
}

public Bank(double interestRate, String sBI) {
	
	this.interestRate = interestRate;
	SBI = sBI;
}
public double getInterestRate() {
	return interestRate;
}
public String getName() {
	return SBI;
}
 

}

