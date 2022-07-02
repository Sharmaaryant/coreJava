package Constructor;

public class Circle2 extends Shape2{
private int radius;

public Circle2(int radius) {
	this.radius = radius;
}

public int getRadius() {
	return radius;
}
public double area () {
	return PI*radius*radius;


}
}
