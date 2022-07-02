package heloo;

public class Teststring {
public static void main(String[] args) {
	String name =" Vijay Dinanath Chauhan ";
	System.out.println(" String Length - " + name.length());
	System.out.println(" Chota vijay - " + name.toLowerCase());
	System.out.println(" Bada vijay - " + name.toUpperCase());
	System.out.println(" 7th Character - " + name.charAt(6));
	System.out.println(" First i position - " + name.indexOf("i"));
	System.out.println(" Last i position - " + name.lastIndexOf("i"));	
	System.out.println(" a is replayed by b - " + name.replace("a","b"));
	System.out.println(" Start with vijay - " + name.startsWith("vijay") );
	System.out.println(" Substring - " + name.substring(6));
	
	
}
}
