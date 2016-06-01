package Classhw3;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = in.nextInt();
		
		while(num <=50){
			if (num%5==0)
				System.out.println(num);
			num=num+1;
		}
	}
}
