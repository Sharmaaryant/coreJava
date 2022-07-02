package array;

import java.time.LocalDate;

public class Excer3 {
public static void main(String[] args) {
	LocalDate endDate = LocalDate .of(2020, 11, 25);
	LocalDate today = LocalDate.now();
	if (endDate.isAfter(today)) {
		System.out.println(" your date is  correct");
		
	} else if(endDate.isBefore(today)){
		System.out.println("Error your date is incorrect" );

	}
}}
