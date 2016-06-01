package Classhw9;

import java.util.Random;

public class FinderRandomTest extends Random{
	
	String subSt1 = "";
	String subSt2 = "";
	String subSt3 = "";
	String subSt4 = "";
	
	String st = "";
	
	
	public String getTestString(){
		
		String alpa = "abcdefghijklmnopqrstuvwxyz";
		
		int i = 50;
		while(i != 0){
			int temp = nextInt(26);
			st = st + alpa.charAt(temp);
			i--;
		}
		
		subSt1 = st.substring(5);
		
		subSt2 = st.substring(15, 21);
		
		subSt3 = st.substring(47, 50);
		
		subSt4 = "false";
		
		return st;
	}
	
	
	
	public String getSubStringTest1(){
		return this.subSt1;
	}
	
	public String getSubStringTest2(){
		return this.subSt2;
	}
	
	public String getSubStringTest3(){
		return this.subSt3;
	}
	
	public String getSubStringTest4(){
		return this.subSt4;
	}
}

