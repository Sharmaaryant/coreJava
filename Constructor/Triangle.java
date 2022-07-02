package Constructor;

public class Triangle extends Shape2{
private int base ;
private int height;



public Triangle(int base, int height) {
	
	this.base = base;
	this.height = height;
}



public int getBase() {
	return base;
}



public int getHeight() {
	return height;
}



public double area() {
	return base*height;
}
}
