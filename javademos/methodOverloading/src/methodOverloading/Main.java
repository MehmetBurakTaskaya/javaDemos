package methodOverloading;

public class Main {

	public static void main(String[] args) {
		Math math= new Math();
		System.out.println(math.add(2, 3));
		math.add(2, 3, 5);
	}

}
