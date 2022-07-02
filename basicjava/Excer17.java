package basicjava;

public class Excer17 {
public static void main(String[] args) {
	int[] a = {2,4,6,8,7,3,5,9};
	int[] b = {2,6,8,7,3,5,9};
	int x = 0;
	int y = 0; 	
	int miss = 0;
	for (int i : a) {
		x = x + i;
		
	}for (int i : b) {
		y = y + i;
		
	}
	miss = x - y;
	System.out.println(" The missing number is :- " + miss);
	
}}
