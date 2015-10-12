import java.util.Scanner;
public class Height
	{
		public static void main(String[] args)
			{
				double feet = inputFeet();
				double inches= inputInches();
				double feetAndInches= combine(feet,inches); 
				double convertToCentimeters = centimeters(feetAndInches);
				double convertToMeters = meters(convertToCentimeters);
				double convertToFeet = newFeet(convertToMeters);
				double convertToInches = newInches(convertToFeet);
				double percentError = percentDeviation(convertToInches,feetAndInches);
			}
		private static double inputFeet()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("How tall are you in Feet? ");
				return userInput.nextDouble();
			}
		private static double inputInches()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("How many Inches?");
				return userInput.nextDouble();
			}
		private static double combine(double numberOfFeet, double numberOfInches)
			{
				double combine = ((numberOfFeet*12) + numberOfInches);
				System.out.println("You are "+((numberOfFeet*12) + numberOfInches)+" Inches tall.");
				return combine;
			}
		private static double centimeters(double combine)
			{
				double convertToCentimeters = (combine*2.54);
				System.out.println("You are "+(combine*2.54)+" Centimeters tall.");
				return convertToCentimeters;
			}
		private static double meters(double centimeters)
			{
				double convertToMeters = (centimeters*0.01);
				System.out.println("You are "+(centimeters*0.01)+" Meters tall.");
				return convertToMeters;
			}
		private static double newFeet(double meters)
			{
				double convertToFeet = (meters*3.28084);
				System.out.println("You are "+(meters*3.28084)+" Feet tall.");
				return convertToFeet;
			}
		private static double newInches (double newFeet)
			{
				double convertToInches = (newFeet*12);
				System.out.println("You are "+(newFeet*12)+" Inches tall.");
				return convertToInches;
			}
		private static double percentDeviation(double convertToInches,double feetAndInches)
			{
				double percentError = (((convertToInches-feetAndInches)/(feetAndInches))*100);
				System.out.println("The percent error is: "+(((convertToInches-feetAndInches)/(feetAndInches))*100)+"%");
				return percentError;
			}	
	}