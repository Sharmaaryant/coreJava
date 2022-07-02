package Oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Testperson {
      public static void main(String[] args) throws ParseException {
      Person p = new Person();
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      String s ="08/05/1999";
      Date d = sdf.parse(s);
      
      
      p.setName("Aryant");
      p.setAddress("Indore");
      p.setDob(d);
      
      
      System.out.println("My name is :-"+p.getName());
      System.out.println("Address :- "+p.getAddress());
      System.out.println("My Date of Birth is :- "+p.getDob());
      
      
	
	
	
	
	
	
	
	
}}
