package Classhw2;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		int millennium = 3000;
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the current year: ");
		
		int year = in.nextInt();
		int nyear = year;
		
		if (year > millennium)
			System.out.println(" More yaer than millennium. ");
		else{
			while (nyear != millennium){
				nyear++;
				}
			}
		
		System.out.println("Another "+(nyear-year)+" years to the millennium.");
		}
	}


