package classhw7;

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class CirclesComponent extends JComponent {

   private Ellipse2D.Double[] circles;
   final int NCIRCLES = 300; 
   int ix = 0; 
   int width;
   int height;
   
   private Random generator;

   public CirclesComponent(int w, int h)
   {
      circles = new Ellipse2D.Double[NCIRCLES];
      width = w;
      height = h;

      generator = new Random();
      
      circle1: for (int i = 0; i < NCIRCLES; i++) {
    	  circles[i] = new Ellipse2D.Double();
    	  int x = generator.nextInt(300) + 1;
    	  int y = generator.nextInt(400) + 1;
    	  int r = generator.nextInt(30) + 1;
    	  Ellipse2D.Double circle = new Ellipse2D.Double(x, y, r, r);
    	  
    	  
    	  for (int j = 0; j < i; j++)
    	  {
    		  if (circlesIntersect(circle, circles[j]) == true)
    			  continue circle1;
    		  }
    	  
    	  circles[i] = circle;
    	  }
      }

   public boolean circlesIntersect(Ellipse2D.Double c1, Ellipse2D.Double c2) {
      double radius1 = c1.getWidth() / 2;
      double radius2 = c2.getWidth() / 2;

      double dx = c1.getX() + radius1 - c2.getX() - radius2;
      double dy = c1.getY() + radius1 - c2.getY() - radius2;

      double distance = Math.sqrt(dx * dx + dy * dy);
      return distance < radius1 + radius2;
   }
   
   public void paintComponent(Graphics g) {
      Graphics2D g2 = (Graphics2D) g;

      for (int i=0; i < circles.length; i++)
         g2.draw(circles[i]);
   }
}