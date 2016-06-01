package Classhw4;

import java.util.*;

public class VendingMachineTester{
	public static void main(String[] args) {
		
		VendingMachine machine = new VendingMachine();
		machine.fillUp(10);
		machine.insertToken();
		machine.insertToken();
		System.out.print("Token count= ");
		System.out.println(machine.getTokenCount());
		System.out.print("Can count = ");
		System.out.println(machine.getCanCount());
}
}

		
class VendingMachine{
	
	int tokenCount=0;
	int cansCount=0;
	
		public void insertToken()
		{
			tokenCount +=1;
			cansCount -=1;
			
		}
		public void fillUp(int cans){
			cansCount += cans;
			
		}
		
		public VendingMachine(){
			cansCount = 10;
			tokenCount =0;
			
		}
		public VendingMachine(int cans){
			cansCount = cans;
			tokenCount=0;
		}
		public int getCanCount(){
			return cansCount;
			
		}
		public int getTokenCount(){
			return tokenCount;
			
		}


	}