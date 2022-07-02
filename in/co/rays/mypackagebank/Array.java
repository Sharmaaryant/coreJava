package in.co.rays.mypackagebank;

public class Array {
public static void main(String[] args) {
	Bank[] b = new Bank[3];
	b [0] = new AxisBank(52.5, "Axis Bank");
	b [1] = new ICICIBank(78.0, "ICICI Bank");
	b [2] = new HDFC(75.9, "HDFC BANK");

for (int i = 0; i < b.length; i++) {
	System.out.println("Interrest Rate is  " + b[i].getInterestRate()  + " in " + b[i].getName());

}}

}
