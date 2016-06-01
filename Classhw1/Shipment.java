package Classhw1;

public class Shipment {
	public boolean isDiscount()
	{
		boolean first;
		boolean second;
		if(fromState.equals("OR")||fromState.equals("WA") ||fromState.equals("BC"))
		{
			if(fromAddress.substring(0,11).equals("Rural Route"))
				first = false;
			else
				first = true;
		}
		
		else
			first = false;
		
		if (toState.equals("OR")||toState.equals("WA")||toState.equals("BC"))
		{
			if(toAddress.substring(0,11).equals("Rural Route"))
				second = false;
			else
				second = true;
		}
		else
			second = false;
		
		if(first && second)
			return true;
		else
			return false;
		
	}
	private String fromAddress;
	private String fromCity;
	private String fromState;
	private String toAddress;
	private String toCity;
	private String toState;

}
