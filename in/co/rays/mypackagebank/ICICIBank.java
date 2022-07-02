package in.co.rays.mypackagebank;

public class ICICIBank extends Bank {
private double interestRate;
private String ICICIBank;
  
public ICICIBank () {

	
	 
}

public ICICIBank(double interestRate, String iCICIBank) {
	
	this.interestRate = interestRate;
	ICICIBank = iCICIBank;
}

public double getInterestRate() {
	return interestRate;
}

public String getName() {
	return ICICIBank;
}





}
