package Classhw9;

import java.util.Scanner;


public class FinderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner in = new Scanner(System.in);
	
		//String st = "";
		//String st1 = "baboksbfjksdbfjkqbjdaskfasjkdlfasdasdjaklj";
		//String st2 = "scjdbabozkjanzljlnvavk:Hghhzvdzbfakjbsdkjb";
		//String st3 = "asdjnkjzbsfkjabsfkjansdkjasnjlznehkfbababo";
		//st = in.nextLine();
		
		FinderRandomTest frand = new FinderRandomTest();
		
		String st = frand.getTestString();
		
		Finder f = new Finder(st);
		
		//String tes = "babo"; 
		System.out.println(f.findFirst(frand.getSubStringTest1()));
		System.out.println(f.findFirst(frand.getSubStringTest2()));
		System.out.println(f.findFirst(frand.getSubStringTest3()));
		System.out.println(f.findFirst(frand.getSubStringTest4()));
	}

}
