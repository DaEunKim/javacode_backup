package Lab04java;

public class DistanceConverter {

	public static void main(String args[]) {
		
		double yards = 3.5;
		final int num1=3;
		final int num2=12;
		double feet = yards *num1;
		double inches = feet *num2;
		System.out.println(yards + " yards are " + feet + " feet\t");
		System.out.println(yards + " yards are "+ inches+" inches\t");
	}

}
