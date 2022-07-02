package Hierarchy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Array {
public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	String t = "08/05/1999";
	Date e = sdf.parse(t);
	Person[] p = new Person[3];
	p[0] = new Businessman("Aryant", "Indore", e, 100000);
	p[1] = new Doctor("Aryant", "Indore", e, "5373836252");
	p[2] = new Student("Aryant", "Indore", e, "675689", 99);
	
	for (int i = 0; i < p.length; i++) {
		System.out.println(p[i].getName());
		System.out.println(p[i].getAddress());
		System.out.println(p[i].getClass());
		System.out.println(p[i].getDob());
	}
	
}
}
