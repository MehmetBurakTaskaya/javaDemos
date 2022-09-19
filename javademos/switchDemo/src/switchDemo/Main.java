package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
			case 'A':
				System.out.println("Great: You Passed");
				break;
			case 'B':
			case 'C':
				System.out.println("Good: You Passed");
				break;
			case 'D':
				System.out.println("Not bad: You Passed");
				break;
			case 'F':
				System.out.println("You Failed");
				break;
				default:
					System.out.println("You entered an unaccepted grade value.");
		}

	}

}
