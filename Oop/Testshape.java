package Oop;



public class Testshape {
public class circle extends Testshape {
private String color ; 
private int  borderwidth;

public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getBorderwidth() {
	return borderwidth;
}
public void setBorderwidth(int borderwidth) {
	this.borderwidth = borderwidth;
}	private int  radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double area () {
		return 3.14* radius*radius;
	}
	
}
}
