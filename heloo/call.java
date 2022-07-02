package heloo;

public class call {
	public static void main(String[] args) {
		int ring = 0;
		boolean pickup = false;
		while (pickup == false) {
			System.out.println("Ringing...:-" + ring);
		ring++;
		if (ring>10) {
			pickup= true;
		} 
		}System.out.println("you have missed call !!");
			
		}}
	
	

