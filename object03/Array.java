package object03;

public class Array {
public static void main(String[] args) {
	Shape[] s1 = new Shape[3];
	s1 [0] = new Rectangle();
	s1 [1] = new Triangle();
	s1 [2] = new Color();
		
	Rectangle r = (Rectangle) s1[0];
	r.setLength(5);
	r.setWidth(7);
	
	Triangle t = (Triangle) s1[1];
	t.setBase(5);
	t.setHeight(5);
	
	Color c = (Color) s1[2];
	c.setRadius(5);
	
	double total = 0.0;
	for (int i = 0; i < s1.length; i++) {
total = total +  s1[i].area();		
	}System.out.println("Total Area =  " + total);
}}
