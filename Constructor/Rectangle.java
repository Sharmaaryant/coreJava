package Constructor;

public class Rectangle extends Shape2 {
private int length;
private int width;
public Rectangle(int length, int width) {
	super();
	this.length = length;
	this.width = width;
}
public int getLength() {
	return length;
}
public int getWidth() {
	return width;
}
public double area() {
	return length*width;
}

}
