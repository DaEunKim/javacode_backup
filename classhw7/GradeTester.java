package classhw7;

import java.util.*;
public class GradeTester {
	
	Scanner in =new Scanner(System.in);
	String name;
	int testscore1,testscore2;
	public GradeTester(String studentName){
		name=studentName;
	}
	public void inputGrades(){
		do{
		System.out.println("Enter "+name+"`s score for test1");
		testscore1=in.nextInt();
		if(testscore1>=0 && testscore1<=100) break;
		System.out.println("0<=score<=100");
		}while(true);
		do{
		System.out.println("Enter "+name+"`s score for test2");
		testscore2=in.nextInt();
		if(testscore2>=0&&testscore2<=100) break;
		System.out.println("0<=score<=100");
		}while(true);
	}
	public double getAverage(){
		return (testscore1+testscore2)/2.0;
	}
	public String getName(){
		return name;
	}
	public String toString(){
		String temp="Name : "+name+"\nTest1 : "+testscore1+"  Test2 : "+testscore2;
		return temp;
	}
}
