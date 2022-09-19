package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int number1 = 23;
		int number2 = 25;
		int number3 = 2;
		int biggest = number1;
		
		if(biggest < number2){
			biggest = number2;
		}
		
		if(biggest < number3){
			biggest = number3;
		}
		
		System.out.println("Biggest number is " + biggest);
	}

}
