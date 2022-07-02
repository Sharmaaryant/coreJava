package Constructor;

public class Tcircle {
public static void main(String[] args) {
	Circle2 c = new Circle2(7);
	c.setColor("red");
	c.setBoarderWidth(8);
System.out.println("Color of circle " + c.getColor());
System.out.println("BoarderWidth of Circle "+ c.getBoarderWidth());
System.out.println("Area of Circle " + c.area());



}
}
