import java.util.Scanner;

public class WeaselOrNot {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		String word;
		boolean yep, nope;
		
		System.out.println( "Type the word \"weasel\", please." );
		word = keyboard.next();
		
		yep = word.equals("weasel");
		nope = ! word.equals("weasel");
		
		System.out.println( "You typed whats was requested: " + yep );
		System.out.println( "You ignoged polite instructions: " + nope );
		
		// yep = "weasel".equals;(word)
		// nope = ! "weasel".equals(word);
	}
}