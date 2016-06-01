package Classhw10;
import java.util.ArrayList;
import java.util.Iterator;

public class ScoreSet {
	
	public double averageWithoutLowest2(){
		
		if(scores.size() <= 2) return 0.0;
		else{
			ArrayList<Integer> temp = new ArrayList<Integer>(scores);
			
			temp.sort(null);
			
			Iterator<Integer> iter = temp.iterator();
			int min1 = iter.next();
			int min2 = iter.next();
			double total = 0.0;
			int count = 0;
			
			
			while(iter.hasNext()){
				total += iter.next();
				count ++;
			}
			return total/count;
		}
	}
	
	private ArrayList<Integer> scores;
	
	public ScoreSet(){
		scores = new ArrayList<Integer>();
	}
	
	public void add(int score){
		scores.add(score);
	}
	
	public String toString() {
		String str = "[";
		Iterator<Integer> iter = scores.iterator();
		
		while(iter.hasNext()){
			str += iter.next();
			if(iter.hasNext()) str += ' ';
		}
		str += "]";
		
		return str;
	}	
}
