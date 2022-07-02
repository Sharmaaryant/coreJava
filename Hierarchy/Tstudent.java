package Hierarchy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tstudent {
public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	String t = "08/05/1999";
	Date e = sdf.parse(t);
	Student s = new Student("Aryant", "Indore", e, "20309876", 99);
	System.out.println(s.getName());
	System.out.println(s.getMarks());
	System.out.println(s.getRollNo());
	
	
}
}
