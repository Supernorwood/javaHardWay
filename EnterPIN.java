import java.util.Scanner;

public class EnterPIN {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int pin, entry;
		String Password;

		pin = 12345;
		Password = "hunter2";

		System.out.println("WELCOME TO THE BANK OF JAVA.");
		System.out.print("ENTER YOUR PASSWORD: ");
		Password = keyboard.next();
		
		if ( ! Password.equals("hunter2") ) 
		System.out.print("ENTER YOUR PIN: ");
		entry = keyboard.nextInt();
		

		while ( entry != pin ) {
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
	}
}