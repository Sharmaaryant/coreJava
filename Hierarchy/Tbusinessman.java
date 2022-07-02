package Hierarchy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Tbusinessman {
public static void main(String[] args) throws ParseException {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	String t = "21/7/2000";
    Date e = sdf.parse(t);
  Businessman b = new Businessman("Aryant", "Indore" , e, 100000);
  System.out.println(b.getName());
  System.out.println(b.getAddress());
  System.out.println(b.getDob());
  System.out.println(b.getIncome());
}
}
