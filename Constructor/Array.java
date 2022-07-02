package Constructor;

public class Array {
public static void main(String[] args) {
	Shape2 [] s1 = new Shape2[3];
	s1 [0] = new Rectangle(6 , 8);
	s1 [1] = new Triangle(4 , 9);
	s1 [2] = new Circle2(9);
	double total = 0.0;
	for (int i = 0; i < s1.length; i++) {
total = total +  s1[i].area();		
	}System.out.println("Total Area =  " + total);
}

}
