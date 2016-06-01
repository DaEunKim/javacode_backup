package Classhw1;

import java.util.*;

public class Order {
	double Price;
	int quantity=0;
	
	public Order(double ballpenPrice){
		this.Price = ballpenPrice;
		}
	public void addBallpens(int quantity){
		this.quantity +=quantity;
		}
	public double getPrice(){
		if(this.quantity >=50000){
			return ((this.Price-0.2)*this.quantity);
			}
		else if(this.quantity>=20000){
			return ((this.Price-0.1)*this.quantity);
			}
		else if(this.quantity>=10000){
			return ((this.Price-0.05)*this.quantity);
			}
		else
			return this.Price*this.quantity;
			
	}
		
	public static void main(String[] args){
		Scanner in =new Scanner(System.in);
		Order pen = new Order(0.95);
		pen.addBallpens(in.nextInt());
		System.out.println(pen.getPrice());
		
		}
	}
