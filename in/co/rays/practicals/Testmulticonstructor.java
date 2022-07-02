package in.co.rays.practicals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testmulticonstructor {
public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	String s = "12/12/2000";

	Date d = sdf.parse(s);
	Multicontructor t = new Multicontructor("Sharma" , "Indore");
	Multicontructor g = new Multicontructor(d, 100000);
	
	System.out.println(t.getName());
	System.out.println(t.getAddress());
    System.out.println(g.getDob());
    System.out.println(g.getSalary());




}
}
