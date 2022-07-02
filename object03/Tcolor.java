package object03;

public class Tcolor {
public static void main(String[] args) {
	Color c = new Color ();
	 
	c.setBoarderWidth(6);
	System.out.println(c.getBoarderWidth());
	c.setRadius(4);
    System.out.println(c.getRadius());
	c.area();
	System.out.println(c.area());
	c.setColor("blue");
	System.out.println(c.getColor());
}
}
