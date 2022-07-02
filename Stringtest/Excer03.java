package Stringtest;

public class Excer03 {
public static void main(String[] args) {
	String name = "43256734267277";
	char search = '7';
	
	int  a=0;
	for (int i = 0; i < name.length(); i++) {
		if(name.charAt(i) == search)
			a++;
		
	}
	
	System.out.println("The character " + search + " appears " + a + " times." );
}
}
