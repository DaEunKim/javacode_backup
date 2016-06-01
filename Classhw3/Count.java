package Classhw3;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String phrase;
		int countBlank;
		int length;
		char ch;
		
		System.out.println();
		System.out.println("Character Counter");
		System.out.println();
		
		
		while(true){
			System.out.println("Enter a phrase or type quit: ");
			phrase = in.nextLine();
			length = phrase.length();
			
			int countA=0;
			int countE=0;
			int countS=0;
			int countT=0;
		
			countBlank =0;
			
			for(int i=0;i<length;i++){
				if (phrase.charAt(i)==' '){
					countBlank++;
					}
				ch = phrase.charAt(i);
				switch(ch){
				case 'a':
				case 'A': countA++;
				break;
				case 'e':
				case 'E': countE++;
				break;
				case 's':
				case 'S': countS++;
				break;
				case 't':
				case 'T': countT++;
				break;
				}
				
			}
			
			if(phrase.equals("quit")){
				break;
				}
				
			System.out.println();
			System.out.println("Number of blank spaces: "+countBlank);
			System.out.println();
			System.out.println("a and A count: "+countA);
			System.out.println("e and E count: "+countE);
			System.out.println("s and S count: "+countS);
			System.out.println("t and T count: "+countT);
			}
		}
	}
