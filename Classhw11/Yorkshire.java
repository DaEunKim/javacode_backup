package Classhw11;
//****************************************************************
//Yorkshire.java
//
//A class derived from Dog that holds information about
//a Yorkshire terrier. Overrides Dog speak method.
//       
//****************************************************************
public class Yorkshire extends Dog
{
	//2. Add Variable
	private int breedWeight = 75;

 public Yorkshire(String name)
 {
	super(name);
 }


 // ------------------------------------------------------------
 // Small bark -- overrides speak method in Dog
 // ------------------------------------------------------------
 public String speak()
 {
	return "woof";
 }

 //2. Add Function
 public int avgBreedWeight()
 {
	return breedWeight;
 }
}
