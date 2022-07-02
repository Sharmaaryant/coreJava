package basicjava;

public class Testarmstrong {
public static void main(String[] args) {
	int num = 153;
	int sum=0;
	int r=0;
	int c=num; 
	while (c!=0) {
		r=c%10;
		sum=sum+(r*r*r);
		c=c/10;
		
		
		
	}if (num==sum) {
		System.out.println(num+"is a armstrong no");
		
	} else {
		System.out.println(num+"is not a armstrong no");

	}

}
}
