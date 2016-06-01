package Classhw14;

import java.util.Scanner;


class CheckingPrice implements OnlinePizzaOrderingSystem{
	
	private static final double numberofmozzarella = 0.0;
	private static final double numberofsauce = 0.0;
	private static final double numberofredonion = 0.0;
	private static final double numberofgreenpepper=0.0;
	private static final double numberofmushroom = 0.0;
	private static final double numberofolive = 0.0;
	private static final double numberofpeperoni = 0.0;
	private static final double numberofsoda = 0.0;
	private static final double numberofbeer = 0.0;
	
	Scanner keyboard = new Scanner(System.in);

	public void topping(){
		//amount of topping 
		System.out.print("Input amount of mozzarella cheeze : ");
		double numberofmozzarella= keyboard.nextDouble();
				
		System.out.print("Input amount of Italian sauce : ");
		double numberofsauce= keyboard.nextDouble();
		
		System.out.print("Input amount of red onion : ");
		double numberofredonion= keyboard.nextDouble();
		
		System.out.print("Input amount of green pepper : ");
		double numberofgreenpepper= keyboard.nextDouble();
		
		System.out.print("Input amount of mushroom : ");
		double numberofmushroom= keyboard.nextDouble();
		
		System.out.print("Input amount of olive : ");
		double numberofolive= keyboard.nextDouble();
				
		System.out.print("Input amount of peperoni : ");
		double numberofpeperoni= keyboard.nextDouble();
				
		
	}
	public void drink(){
		//number of drink
		System.out.print("Input number of soda : ");
		double numberofsoda= keyboard.nextDouble();
				
		System.out.print("Input number of beer : ");
		double numberofbeer= keyboard.nextDouble();
				
		//number of drink size
		System.out.print("What do you want to be size of your drink?  ");
		System.out.println("If you want to large one, Input number '1'. Medium one, number '2'. , Small one, number '3'. ");
				
		int sizedrink= keyboard.nextInt();		
		if (sizedrink ==1){
			System.out.println("You choose large size drink");}
		else if(sizedrink==2){
			System.out.println("You choose Medium size drink");}
		else if(sizedrink==3){
			System.out.println("You choose Small size drink");}
		
	}
	
	public void sizeofpizza(){
		
		System.out.print("What do you want the size of pizza?" );
		System.out.print("If you want to large size, Input '1'. or Medium size, Input '2'. or Small size, Input '3'. " );
		int sizepizza= keyboard.nextInt();
		
		if (sizepizza ==1){
			System.out.println("You choose large size pizza");
			
		    double largepizza_cost=priceOflargepizza + (numberofmozzarella*priceOfmozzarella+numberofsauce*priceOfsauce+
		    		numberofredonion*priceOfredonion+numberofgreenpepper*priceOfgreenpepper+
		    		numberofmushroom*priceOfmushroom+priceOfolive*numberofolive+ numberofpeperoni*priceOfpeperoni);
		    System.out.println(largepizza_cost);

			TotalpriceOfToppings = largepizza_cost+(priceOfsoda*numberofsoda+numberofbeer*priceOfbeer);
		    
		    
		}
		else if(sizepizza==2){
			System.out.println("You choose Medium size pizza");
			
			double Mediumpizza_cost=priceOfMediumpizza+(numberofmozzarella*priceOfmozzarella+numberofsauce*priceOfsauce+
		    		numberofredonion*priceOfredonion+numberofgreenpepper*priceOfgreenpepper+
		    		numberofmushroom*priceOfmushroom+priceOfolive*numberofolive+ numberofpeperoni*priceOfpeperoni);
			System.out.println(Mediumpizza_cost);
			TotalpriceOfToppings = Mediumpizza_cost+(priceOfsoda*numberofsoda+numberofbeer*priceOfbeer);
		    
		    
		}
		else if(sizepizza==3){
			System.out.println("You choose Small size pizza");
			
			double Smallpizza_cost=priceOfSmallpizza+(numberofmozzarella*priceOfmozzarella+numberofsauce*priceOfsauce+
		    		numberofredonion*priceOfredonion+numberofgreenpepper*priceOfgreenpepper+
		    		numberofmushroom*priceOfmushroom+priceOfolive*numberofolive+ numberofpeperoni*priceOfpeperoni);
			System.out.println(Smallpizza_cost); 
			TotalpriceOfToppings = Smallpizza_cost+(priceOfsoda*numberofsoda+numberofbeer*priceOfbeer);
		    
		}
	}
	public void TotalPrice(){
		System.out.println(TotalpriceOfToppings);
		
	    
	}
	
		double pizza_cost = 0.0; // pizza cost
	    
	    double priceOflargepizza=16;
	    double priceOfMediumpizza=13;
	    double priceOfSmallpizza=10;
	    
	    double TotalpriceOfToppings = 0.0;
	    double priceOfmozzarella=0.25;
	    double priceOfsauce=0.25;
	    double priceOfredonion=0.25;
	    double priceOfgreenpepper=0.45;
	    double priceOfmushroom=0.45;
	    double priceOfolive=0.65;
	    double priceOfpeperoni=1.0;
	    
	    double priceOfsoda=1.0;
	    double priceOfbeer = 2;
	    double priceOfsizeBigdrink = 1.2;
	    double priceOfsizeMiddledrink = 1.0;
	    double priceOfsizeSmalldrink = 0.8;
	    
	    
}