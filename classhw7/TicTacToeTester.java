package classhw7;

import java.util.*;
public class TicTacToeTester {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String player ="x";
		TicTacToe game=new TicTacToe();
		boolean done=false;
		while(!done){
			System.out.println(game.toString());
			System.out.println(game.flipHorizontal());
			System.out.print("Row for "+player +" or -1 to exit : ");
			int row=in.nextInt();
			if(row<0) done=true;
			else{
				System.out.print("Column for "+player +" :");
				int column=in.nextInt();
				game.set(row, column, player);
				if(player.equals("x")) player ="o";
				else player="x";
			}
		}
	}
}
