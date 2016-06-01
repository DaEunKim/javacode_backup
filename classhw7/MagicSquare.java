package classhw7;

import java.util.*;
public class MagicSquare {
	Scanner in =new Scanner(System.in);
	int[][] square;
	public MagicSquare(int size){
		square=new int[size][size];
	}
	public int sumRow(int row){
		int sum=0;
		for(int i=0;i<square[row].length;i++)
			sum+=square[row][i];
		return sum;
	}
	public int sumCol(int col){
		int sum=0;
		for(int i=0;i<square.length;i++)
			sum+=square[i][col];
		return sum;
	}
	public int sumMainDia(){
		int sum=0;
		for(int i=0;i<square.length;i++)
			sum+=square[i][i];
		return sum;
	}
	public int sumOtherDia(){
		int sum=0;
		for(int i=0;i<square.length;i++)
			sum+=square[i][square.length-i-1];
		return sum;		
	}
	public boolean magic(){
		int sum=this.sumMainDia();
		for(int row=0;row<square.length;row++)
			if(sum!=this.sumRow(row)) return false;
		for(int col=0;col<square.length;col++)
			if(sum!=this.sumCol(col)) return false;
		if(sum!=this.sumOtherDia()) return false;
		else return true;
	}
	public void readSquare(){
		System.out.println("input");
		for(int[]row :square){
			for(int col=0;col<row.length;col++){

				row[col]=in.nextInt();
			}
		}
		System.out.println("bye");
	}
	public String printSquare(){
		String p="";
		for(int r=0;r<square.length;r++){
			p+="| ";
			for(int c=0;c<square.length;c++)
			p+=square[r][c]+" ";
			p+="|\n";
			}
		return p;
	}
}
