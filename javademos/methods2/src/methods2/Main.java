package methods2;

public class Main {
	public static void main(String[] args) {
		String text = "Today, the weather is beautiful.";
		String newText = text.substring(0,2);
		System.out.println(newText);
		int number = plus(5,6);
		System.out.println(number);
		int total = plus2(2,3,4,5,6,10);
		System.out.println(total);
	}
	
	public static void add() {
		System.out.println("Added");
	}
	
	public static void delete() {
		System.out.println("Deleted");
	}
	
	public static void update() {
		System.out.println("Updated");
	}
	
	public static int plus(int number1, int number2) {
		return number1+number2;
	}
	
	public static int plus2(int... numbers) {
		int total = 0;
		for(int number:numbers) {
			total += number;
		}
		return total;
		
	}
	
	public static String giveCity() {
		return "Ankara";
	}
	
}
