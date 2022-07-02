package in.co.rays.mypackagebank;

public class HDFC extends Bank {
private double interestRate;
private String HDFC;
  
 public HDFC () {
	 
 }

public HDFC(double interestRate, String hDFC) {
	
	this.interestRate = interestRate;
	HDFC = hDFC;
}

public double getInterestRate() {
	return interestRate;
}

public String getName() {
	return HDFC;
}
  
}
