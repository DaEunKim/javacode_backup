package classhw7;

import java.util.*;

public class Randomdom {

	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		Random r = new Random();
		System.out.print("How many numbers do you want to generate? ");
		int x=t.nextInt();
		System.out.print("What is the number of values? ");
		int values = t.nextInt();
		int [] element = new int[values];
		
		for (int i=0;i<values;i++){
			element[i] = r.nextInt(x);
			System.out.println(i +" "+ element[i]);
			}
		}
	}
