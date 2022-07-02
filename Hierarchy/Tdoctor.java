package Hierarchy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Tdoctor {
public static void main(String[] args) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	String t = "21/7/2000";
	Date e = sdf.parse(t);
	Doctor d = new Doctor("Arant", "Indore", e , "45921245922");
	System.out.println(d.getName());
	System.out.println(d.getAddress());
	System.out.println(d.getDob());
	System.out.println(d.getRegistrationNo());
}
}
