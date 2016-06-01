package Classhw1;

import java.util.*;

public class Pen {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("구매할 볼펜 갯수를 입력하시오. " );
		int quantity=in.nextInt();
		
		
		double ballpenPrice=0.95;
		double getPrice = ballpenPrice*quantity;
		
		if(quantity ==10000)//다음 만개 
		{
			ballpenPrice = getPrice-(0.05*getPrice);
			System.out.println("Total Price : "+ballpenPrice+ " won.");
			
		}
		else if(quantity>=20000)
		{
			ballpenPrice = getPrice-(0.1*getPrice);
			
			System.out.println("Total Price : "+ballpenPrice+ " won.");
			
		}
		
		else if(quantity>=50000)
		{
			ballpenPrice = getPrice-(0.2*getPrice);
					
			System.out.println("Total Price : "+getPrice+ " won. ");
		}
	}
	
}