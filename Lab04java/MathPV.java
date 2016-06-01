package Lab04java;

import java.util.Scanner;

public class MathPV {

	public static void main(StringTest[] args) {
		System.out.println("Input the PMT : ");
		Scanner in = new Scanner(System.in);
		double PMT = in.nextDouble();
		System.out.println("Input the number of years : ");
		int n = in.nextInt(); //n:지불을 원하는 년도수
		System.out.println("Input the interest rate : ");
		double i= in.nextDouble(); //i:이자율
		Math.pow(1+i, n-1);
		
		double PV = PMT*(((Math.pow(1+i, n-1)-1)/i)/(Math.pow(1+i, n-1)+1));
		System.out.println("PV = " + PV);

	}

}
