package object03;

public class Color extends Shape {
private int radius;

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}
public double area () {
	return PI*radius*radius;
}
}
