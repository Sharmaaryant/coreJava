package basicjava;

public class excer12 {
public static void main(String[] args) {
	int num = 3553;
	int reversednum = 0;
	int a;
	int originalnum = num;
	
	while (num != 0) {
		a = num % 10;
		reversednum = reversednum * 10 + a;
		num  = num / 10;
		
	}
		if (originalnum == reversednum) {
			System.out.println(originalnum + " is palindrom");
		} else {
           System.out.println(originalnum + " is not palindrom");
		}}
		
		
		
	
	
	
}

