package classhw7;

import java.util.*;
public class MagicSquareTester {
	static Scanner in =new Scanner(System.in);
	public static void main(String[] args){
		int count =1;
		System.out.println("hi");
		int size=in.nextInt();
		while(size>0){
			MagicSquare sq=new MagicSquare(size);
			sq.readSquare();
			System.out.println(sq.printSquare());
			System.out.println(sq.magic());
		}
	}
}
