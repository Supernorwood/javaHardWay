import java.util.Scanner;

public class BMICalculator {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double lbs, feet, inches, bmi;
		
	
		System.out.print( "Your height (feet only): " );
		feet = keyboard.nextDouble();
		
		System.out.print( "Your height (inches): " );
		inches = keyboard.nextDouble();
	
		System.out.print( "Your weight in lbs: " );
		lbs = keyboard.nextDouble();
	
		bmi = lbs*4.88 / ( (feet+(inches/12))*(feet+(inches/12)) );
	
		System.out.println( "Your BMI is " + bmi );
	}
}