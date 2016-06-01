package Classhw9;

public class Finder {
	private String s;
	
	public Finder(String aString){
		s = aString;
	}
	
	public int findFirst(String sub){
		int i = 0;
		while(sub.length() + i <= s.length()){
			if(s.substring(i,  i + sub.length()).equals(sub))
					return i;
			else
				i++;
		}
		return -1;
	}

	public int findLast(String sub){
		String sCopy = s;
		while (sub.length() <= sCopy.length())
		{
			if (sCopy.substring(sCopy.length()-sub.length(), sCopy.length()).equals(sub))
				return sCopy.length() - sub.length();
			else 
				sCopy = sCopy.substring(0, sCopy.length() - 1);
		}
		return -1;
	
	}
}
