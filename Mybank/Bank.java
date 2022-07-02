package Mybank;

public class Bank {
	private double interestRate;
	private  String SBI;
	public double interestRate() {
		return 11.0;
	}
public String getName() {
	
	return "SBI";
}
public static Bank getBank(int i) {
	if (i == 1) 
		return new AxisBank();
	
	if (i == 2) 
		return new HDFC();
	if(i == 3)
		return new ICICIBank();
	return null;	
	}
}


