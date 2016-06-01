package Classhw2;

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class CoffeeCansComponent extends JComponent {
	public void paintComponent(Graphics g)
	{
		
		Graphics2D g2 =(Graphics2D) g;
		Rectangle2D.Double can1 = new Rectangle2D.Double(4, 5, 34, 120);
		Rectangle2D.Double can2 = new Rectangle2D.Double(38, 5, 34, 120);
		Rectangle2D.Double can3 = new Rectangle2D.Double(172, 5, 34, 120);
		Rectangle2D.Double can4 = new Rectangle2D.Double(106, 5, 34, 120);
		
		g2.draw(can4);
		g2.draw(can3);
		g2.draw(can2);
		g2.draw(can1);
		
	}
}
/**

import javax.swing.JFrame;
public class CoffeeCansViewer{

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		final int FRAME_WIDTH = 150;
		final int FRAME_HEIGHT = 140;
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CoffeeCansComponent component = new CoffeeCansComponent();
		frame.add(component);
		
		frame.setVisible(true);
		

	}
	}**/

