package Constructor;

public class Trectangle {
public static void main(String[] args) {
Rectangle r = new Rectangle(8, 9);
r.setBoarderWidth(8);
r.setColor("blue");
System.out.println("Length of Rectangle = " + r.getLength());
System.out.println("Width of Rectangle = " + r.getWidth());
System.out.println("Area of Rectangle = " + r.area());
System.out.println("BoarderWidth of Rectangle = " + r.getBoarderWidth());
System.out.println("Color of Rectangle = " + r.getColor());

}
}
