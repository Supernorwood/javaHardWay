import java.util.Scanner;

public class BMICategories {
	public static void main( String[] args ){
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
								
		System.out.print( "BMI category: " );
		if ( bmi < 15.0 ) {
			System.out.println( "very severely underweight" );
		}
		else if ( bmi <= 16.0 ) {
			System.out.println( "severly underweight" );
		}
		else if ( bmi < 18.5 ) {
			System.out.println( "underweight" );
		}
		else if ( bmi < 25.0 ) {
			System.out.println( "normal weight" );
		}
		else if ( bmi < 30.0 ) {
			System.out.println( "overweight" );
		}
		else if ( bmi < 35.0 ) {
			System.out.println( "moderately obese" );
		}
		else if ( bmi < 40.0 ) {
			System.out.println( "severely obese" );
		}
		else if ( bmi < 25.0 ) {
			System.out.println( "normal weight" );
		}
	}
}