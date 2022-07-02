package basicjava;

public class Excer8 {
public static void main(String[] args) {
	int [][] b=new int[10][10];
	for (int i=0; i<10; i++) {
		for (int j = 0; j < 10; j++) {
			b[i][j]=i*j;
			System.out.print(b[i][j]+"\t");
			
		}
		System.out.println(" ");
	}
}
}
