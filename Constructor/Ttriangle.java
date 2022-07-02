package Constructor;

public class Ttriangle {
	public static void main(String[] args) {
	Triangle t = new Triangle(9 , 5);
	t.setBoarderWidth(8);
	t.setColor("Brown");
	System.out.println("Base of Triangle = "+t.getBase());
	System.out.println("Height of Triangle = "+t.getHeight());
	System.out.println("BoarderWidth of Triangle = "+t.getBoarderWidth());
	System.out.println("Color of Triangle = "+t.getColor());
	System.out.println("Area of Triangle = "+t.area());
	
	
	}
}
