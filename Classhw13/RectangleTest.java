package Classhw13;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RectangleTest {
	public static void main(String[] args){
	
	Rectangle rect1= new Rectangle(5, 10, 20, 30);
	Rectangle rect2= new Rectangle(10, 20, 30, 15);
	Rectangle rect3= new Rectangle(20, 30, 45, 10);
	
	Rectangle other_rect1= new Rectangle(5, 15, 20, 30);
	Rectangle other_rect2= new Rectangle(20, 30, 40, 10);
	Rectangle other_rect3= new Rectangle(15, 20, 35, 10);
		
	
	ArrayList<Rectangle> list = new ArrayList<Rectangle>();
	list.add(rect1);
	list.add(rect2);
	list.add(rect3);
	
	list.add(other_rect1);
	list.add(other_rect2);
	list.add(other_rect3);
	class RectangleComparator implements Comparator<Rectangle> {
		public int compare (Rectangle r1,Rectangle r2) {
			
			Rectangle r0 = (Rectangle) r1;
			double area1 = r0.getWidth() * r0.getHeight();
			Rectangle r3 = (Rectangle) r2;
			double area2 = r3.getWidth() * r3.getHeight();
			
			if (area1 < area2)
				return -1;
			if (area1 > area2)
	    	   return 1;
			if(area1==area2)
	    	   return 0;
			return 0;
		}

	}
	Comparator<Rectangle> comp = new RectangleComparator();
	Collections.sort(list, comp);
	for (Rectangle r : list)
		System.out.println( r.getWidth()+ "  " + r.getHeight());
	
	}

}
