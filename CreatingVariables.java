public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, height;
		double seconds, e, checking, velocity;
		String firstName, lastName, title, race, gender;
		
		x = 10;
		y = 400;
		age = 39;
		height = 68;
		
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		velocity = 9.84;
		
		firstName = "Graham";
		lastName = "Mithcell";
		title = "Mr.";
		race = "black";
		gender = "male";
		
		System.out.println( "The variable x contains " + x + " at " + velocity + " velocity. " );
		System.out.println( "The avergae man's height is " + height + " inches. " );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " +e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.print( "My name's " + title + " " + firstName + lastName + "." + " "  );
		System.out.println( "I am a " + race + " " + gender + "." );
	}
}