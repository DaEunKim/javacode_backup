package classhw7;

import java.util.*;
public class StudentScoresTester {
	public static void main(String[] args){
		StudentScores stuSc= new StudentScores();
		Scanner in =new Scanner(System.in);
		while(true){
			System.out.println("Enter a student name or quit to end");
			String name=in.nextLine();
			if(name.equals("quit")) break;
			else{
				System.out.println("Enter a score ");
				int score =in.nextInt();
				stuSc.add(name, score);
				System.out.println("high "+stuSc.getHighest());
				System.out.println("low   "+stuSc.getLowest());
			}
		}
	}
}
