package array;

import java.time.LocalDate;
import java.time.Period;

public class Excer1 {
public static void main(String[] args) {
	        LocalDate today = LocalDate.now();
			LocalDate  birthday = LocalDate.of(1999,5,8);
			Period diffrent = Period.between(birthday, today);
			System.out.println(" Year " + diffrent.getYears());
			System.out.println(" Month " + diffrent.getMonths());
			System.out.println(" Day " + diffrent.getDays()) ;
		}	
	
	
}

