package Classhw14;

import java.text.DecimalFormat;
import java.util.Scanner;

interface OnlinePizzaOrderingSystem {
	public static void main(String[] args) {
	    DecimalFormat df = new DecimalFormat("#.##");
	    Scanner keyboard = new Scanner(System.in);
	    
	    System.out.println("Pizza Ordering System");
		System.out.println("========================================");
		System.out.println("Client's Address:");
		System.out.println("Kookmin University");
		System.out.println("========================================");
		System.out.println("Client's Order: ");
		System.out.println("1. Add a pizza to the order");
		System.out.println("2. Add a drink to the order");
		System.out.println("1. Done!");
		System.out.println("Your choice:    ");
		System.out.println("========================================");
		System.out.println("Pizza Orger");
		System.out.println("*** Select Pizza Size");
		System.out.println("1. Small");
		System.out.println("2. Medium");
		System.out.println("3. Large");
		System.out.println("Your choice:    ");
		System.out.println("***Select Toppings");
		System.out.println(" <Available Toppings>");
		System.out.println(" 0) Mozzarella_cheese");
		System.out.println(" 1) Italian_sauce");
		System.out.println(" 2) Red_onions");
		System.out.println(" 3) Green_peppers");
		System.out.println(" 4) Mushrooms");
		System.out.println(" 5) Black_olives");
		System.out.println(" 6) Peperoni");
		System.out.println("Your choice:       ");
		System.out.println("Add another topping (Y/N)?");
		System.out.println("<Available Toppings>");
		System.out.println(" 0) Mozzarella_cheese");
		System.out.println(" 1) Italian_sauce");
		System.out.println(" 2) Red_onions");
		System.out.println(" 3) Green_peppers");
		System.out.println(" 4) Mushrooms");
		System.out.println(" 5) Black_olives");
		System.out.println(" 6) Peperoni");
		System.out.println("Your choice:       ");
		System.out.println("Add another topping (Y/N)?");
		System.out.println("========================================");
		System.out.println("Client's Order:");
		System.out.println("1. Add a pizza to the order");
		System.out.println("2. Add a drink to the order");
		System.out.println("1. Done!");
		System.out.println("Your choice:    ");
		System.out.println("========================================");
		System.out.println("Drink Order");
		System.out.println("*** Select Drink type");
		System.out.println("1. Soda");
		System.out.println("2. Beer");
		System.out.println("Your choice:      ");
		System.out.println("***Select Size");
		System.out.println("1. Small");
		System.out.println("2. Medium");
		System.out.println("3. Large");
		System.out.println("Your choice: ");
		System.out.println("========================================");
		System.out.println("Client's Order:");
		System.out.println("1. Add a pizza to the order");
		System.out.println("2. Add a drink to the order");
		System.out.println("1. Done!");
		System.out.println("Your choice:    ");
		System.out.println("========================================");
		System.out.println("Order Summary");
		System.out.println("kmu");
		System.out.println("Thin Crust Pizza (Mozzarella_cheese, Green_peppers)");
		System.out.println("Pizza price: ");
		System.out.println("Soda (large),price : ");
		System.out.println("Total price :    ");

	}
}
