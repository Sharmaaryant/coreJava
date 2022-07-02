package Hierarchy;

import java.util.Date;

public class Student extends Person{
 private String RollNo;
 private int marks;


public Student(String name, String address, Date dob, String rollNo, int marks) {
	super(name, address, dob);
	RollNo = rollNo;
	this.marks = marks;
}
public String getRollNo() {
	return RollNo;
}
public int getMarks() {
	return marks;
}
 
}
