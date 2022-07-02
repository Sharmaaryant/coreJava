package in.co.rays.practicals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {

	public static void main(String[] args) throws ParseException {

		Person p = new Person();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		String s = "12/12/2000";

		Date d = sdf.parse(s);

		p.setName("Kamal");
		p.setDob(d);
		p.setAddress("Indore");

		System.out.println("Name = " + p.getName());
		System.out.println("DOB = " + p.getDob());
		System.out.println("Address = " + p.getAddress());

	}

}
