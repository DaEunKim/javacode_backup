package Classhw13;

import java.util.ArrayList;
import java.util.Collections;

public class BankAccount implements Comparable<BankAccount>{
	
	private double balance;
	
	
	public static void main(String[] args){
		
		ArrayList<BankAccount> list = new ArrayList<BankAccount>();
		
		BankAccount ba1= new BankAccount(12345);
		BankAccount ba2= new BankAccount(23456);
		BankAccount ba3= new BankAccount(34567);
		BankAccount ba4= new BankAccount(45678);
		BankAccount ba5= new BankAccount(56789);
			
		list.add(ba1);
		list.add(ba2);
		list.add(ba3);
		list.add(ba4);
		list.add(ba5);
		
		//list.add(new BankAccount(200.22));
		//list.add(new BankAccount(100.11));
		//list.add(new BankAccount(300.33));
		
		Collections.sort(list);
		for (BankAccount b:list)
			System.out.println(b.getBalance());
		//for(int i =0; i<list.size(); i++)
			//System.out.println(list.get(i).balance);
	}
	
	public BankAccount(){
		balance =0;
	}
	
	
	public BankAccount(double initialBalance){
		balance = initialBalance;
	}
	
	public void deposit(double amount){
		double newBalance = balance + amount;
		balance = newBalance;
	}
	
	public void withdraw(double amount){
		double newBalance = balance - amount;
		balance = newBalance;	
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getMeasure(){
		return balance;
	}
	
	public int compareTo(BankAccount other){
		if(balance<other.balance)
			return 1;
		if(balance ==other.balance)
			return 0;
		return -1;
		
	}
}
