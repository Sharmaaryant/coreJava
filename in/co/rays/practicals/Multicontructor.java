package in.co.rays.practicals;

import java.util.Date;

public class Multicontructor {
private String name;
private String address;
private Date dob;
private int salary;
public Multicontructor() {

}
public Multicontructor(String a, String b) {
name = a ;
address = b ;
}
	public Multicontructor(Date c , int d) {
		dob = c;
		salary = d;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public Date getDob() {
		return dob;
	}
	public int getSalary() {
		return salary;
	}





}
