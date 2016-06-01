package Classhw14;

import java.util.Scanner;

class AddressOfBuyer implements OnlinePizzaOrderingSystem {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String NameofClient = in.next();
		
		System.out.println("Enter your address: ");
		String AddressofClient = in.next();
		
		System.out.println("This is client's name : " + NameofClient);
		System.out.println("This is client's address : " + AddressofClient);
	    
		

	}

}
