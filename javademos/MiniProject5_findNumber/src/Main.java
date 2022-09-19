
public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] {1,2,5,7,9,0};
		int search = 3;
		boolean isThere=false;
		
		for(int number:numbers) {
			if(number==search) {
				isThere=true;
				break;
			}
		}
		
		if(isThere) {
			System.out.println("Number is there");
		}else {
			System.out.println("Number is not there");
		}
	}

}
