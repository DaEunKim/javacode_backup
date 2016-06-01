package classhw6;

import java.util.*;

public class Circle {
	
	final static double PI =3.14;
	static int r;
	
	public Circle(int r){
		this.r=r;
		
	}
	static void circleCircumference(){
		double circumference = 2*PI*r;
		
	}
	static void circleArea(){
		double area = PI*r*r;
		
	}

	public static void main(String[] args) {
		System.out.println();
		

	}
	
	
	public int compareRadius (double radius1, double radius2)
	{
		final double EPSILON = 1E-12;
		double diff = radius1 - radius2;
		if(Math.abs(diff) < EPSILON) 
			return 0;
		if(diff < 0) 
			return -1;
		if(diff > 0) 
			return 1;
		return 0;
		
	}

}
