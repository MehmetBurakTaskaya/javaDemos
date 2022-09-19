
public class Main {

	public static void main(String[] args) {
		int number = 28;
		int total = 0;
		
		if(number==0) {
			System.out.println(number +" is not a perfect number");
			return;
		}
		
		if(number<1) {
			System.out.println("Invalid number!");
			return;
		}
		
		for(int i = 1; i < number; i++) {
			if(number % i == 0) {
				total = total + i;
			}
		}
		
		if (total == number){
			System.out.println(number +" is a perfect number");
		}else {
			System.out.println(number +" is not a perfect number");
		}
	}

}
