package classhw7;


public class TicTacToe {
	private String[][] board;
	private final int ROWS=3;
	private final int COLUMNS=3;

	public TicTacToe(){
		board =new String[ROWS][COLUMNS];
		for (int i=0;i<ROWS;i++)
			for(int j=0;j<COLUMNS;j++)
				board[i][j]="  ";
	}
	
	public void set(int i,int j,String player){
		if(board[i][j].equals("  ")) board[i][j]=player;
	}

	public String toString(){
		String r= "";
		for(int i=0;i<ROWS;i++){
				r=r+" | ";
				for(int j=0;j<COLUMNS;j++)
					r=r+board[i][j];
					r=r+" |\n";
		}
		return r;
	}

	public String flipHorizontal(){
		String r="";
		for(int i=0;i<COLUMNS;i++){
			r=r+" | ";
			for(int j=0;j<ROWS;j++)
				r=r+board[j][i];
			r=r+" |\n";
		}
		return r;
	}
}
