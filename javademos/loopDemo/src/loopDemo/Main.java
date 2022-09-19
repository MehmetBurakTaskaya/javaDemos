package loopDemo;

public class Main {

	public static void main(String[] args) {
		//For
		for(int i=1; i<10; i++) {
			System.out.println(i);
		}
		System.out.println("Loop has ended");
		
		for(int i=2; i<10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For loop has ended");

		
		//While
		int i=1;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While loop has ended");
		
		int k=10;
		while(k<10) {
			System.out.println(k);
			k++;
		}
		System.out.println("While loop has ended");
		
		//Do-While
		int j=1;
		do {
			System.out.println(j);
			j++;
		}while(j<10);
		System.out.println("Do-While loop has ended");
		
		int g=100;
		do {
			System.out.println(g);
			g++;
		}while(g<10);
		System.out.println("Do-While loop has ended");
		
	}

}
