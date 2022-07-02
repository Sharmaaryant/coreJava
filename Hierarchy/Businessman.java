package Hierarchy;

import java.util.Date;

public class Businessman extends Person{
 private double income;

public Businessman(String name, String address, Date dob, double income) {
	super(name, address, dob);
	this.income = income;
}

public double getIncome() {
	return income;
}
}
