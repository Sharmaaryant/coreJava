package in.co.rays.mypackagebank;

public class AxisBank extends Bank {
	
	private double interestRate;
	private String  SBI;
	
	public AxisBank ( ) {
		
	}

	public AxisBank(double interestRate, String sBI) {
		
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

	
