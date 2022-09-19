package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String text = "Today, the weather is very beautiful.";
		System.out.println(text);
		System.out.println("Number of characters : "+text.length());
		System.out.println("5th character : "+text.charAt(4));
		System.out.println(text.concat(" Great!"));
		System.out.println(text.startsWith("T"));
		System.out.println(text.startsWith("B"));
		System.out.println(text.endsWith("."));
		System.out.println(text.endsWith("l"));
		char[] characters = new char[5];
		text.getChars(0, 5, characters, 0);
		System.out.println(characters);
		System.out.println(text.indexOf("a"));
		System.out.println(text.lastIndexOf("a"));
				
		System.out.println("------------------------");
		String newText = text.replace(' ', '-');
		System.out.println(newText);
		System.out.println(text.substring(2));
		System.out.println(text.substring(2,5));
		System.out.println("------------------------");
		
		for(String word: text.split(" ")){
			System.out.println(word);
		}
		
		System.out.println(text.toLowerCase());
		System.out.println(text.toUpperCase());
		
		
		System.out.println("------------------------");
		String text2 = "          Today, the weather is very beautiful.    ";
		System.out.println(text2);
		System.out.println(text2.trim());
		
		
	}
		

}
