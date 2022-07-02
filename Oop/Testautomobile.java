package Oop;

public class Testautomobile {
public static void main(String[] args) {
	Automobile a = new Automobile();
	
	a.setColor("black");
	a.setSpeed(500);
	a.setMake("kawasaki");
	a.setGear(6);
System.out.println(a.getGear());
System.out.println(a.getColor());
System.out.println(a.getMake());
System.out.println(a.getSpeed());
}
}
