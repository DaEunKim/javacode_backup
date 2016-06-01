package classhw8;

import java.util.Scanner;

public class TransferTest {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Account account1 = new Account(1000000," daeun ",1111);
		Account account2 = new Account(2000000,"eunpyo ",2222);
		
		while(true){
			System.out.println(" ");
			System.out.println("account1-->account2 ? account2-->account1 ?");
			System.out.println("if you want to stop, input 0.");
			int W = in.nextInt();
			if(W ==1){
				account2.transfer(account1, 100000);
				System.out.println("Summary");
			
				account2.printSummary();
				System.out.println("");
				account1.printSummary();
			
			}
			else if(W ==2){
				account1.transfer(account2, 100000);
			
				System.out.println("Summary");
			
				account2.printSummary();
				System.out.println("");
			
				account1.printSummary();
			
			}
			else if(W==0){
				break;
			
		}
			else{
				System.out.println("wrong ");
				break;
			}
		}
		
	}

}
