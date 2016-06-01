package Classhw3;

import java.util.*;

public class Temps {

	public static void main(String[] args) {
		final int HOURS_PER_DAY = 24;
		int temp;
		
		System.out.println();
		System.out.println("Temperature Reading for 24 Hour Period ");
		System.out.println();
		
		Scanner in = new Scanner(System.in);
		
		int minTemp = 1000;
		int maxTemp = -1000;
		int timeOfMax=0;
		int timeOfmin=0;
		for (int hour = 0; hour < HOURS_PER_DAY; hour++)
		{
			System.out.print("Enter the temperature reading at "+hour+" hours: ");
			temp = in.nextInt();
			if (temp > maxTemp){
				maxTemp=temp;
				timeOfMax = hour;
				}
			else{ 
				maxTemp = maxTemp;
				}
			if(temp < minTemp){
				minTemp = temp;
				timeOfmin = hour;
			}
			else{
				minTemp = minTemp;
			}
			
		}
		System.out.println("Maxtemp : " + maxTemp);
		System.out.println("TimeofMax: "+ timeOfMax);
		System.out.println("Mintemp: "+ minTemp);
		System.out.println("TimeofMin: "+timeOfmin);
	}

}
