package classhw7;

import java.util.*;

public class ScoreSet {
	private int[] scores;
	private int[] temp;
	private int ix = 0;
	Scanner in = new Scanner(System.in);
	public ScoreSet(){
		scores = new int[10];
		}
	public void add(int score){
		if (ix<scores.length){
			scores[ix++]=score;
			}
		else if(ix==10){
			temp=new int[15];
			System.arraycopy(scores, 0, temp, 0, 10);
			temp[ix++]=score;
		}else{
			temp[ix++]=score;
		}
	}
	public double averageWithoutLowest2(){
		double average;
		double total=0;
		if(ix<10){Arrays.sort(scores);}
		else{Arrays.sort(temp);}
		if(ix<10){
			for (int i=12-ix;i<scores.length;i++){
				total += scores[i];
			}
			average = total/(ix-2);
		}
		else{
			for(int i=17-ix; i<temp.length; i++){
				total += temp[i];
				}
			average = total/(ix-2);
			}
		return average;
		}
	
	
	public static void main(String[] args){
		ScoreSet s = new ScoreSet();
		for(int i=10; i<150;i+=10){
			s.add(i);
		}
		System.out.println(s.averageWithoutLowest2());
	}

}