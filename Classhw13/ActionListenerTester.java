package Classhw13;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class ActionListenerTester{
	
public static void main(String[] args){
	
	
		class CurrentTimePrinter implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			
			System.out.println(new Date());
		
		}
	}
		ActionListener listener = new CurrentTimePrinter();
		
		final Timer t = new Timer(1000,listener);
	class TimerToggler implements ActionListener{
			
			public void actionPerformed(ActionEvent event) {
				
				if(t.isRunning())
					t.stop();
				else
					t.restart();
			
			}
			
		}
	ActionListener listener2 = new TimerToggler();
	Timer t2 = new Timer(15000, listener2);
	t2.start();
	
	class TimerStop implements ActionListener{
		public void actionPerformed(ActionEvent event){
			if(t2.isRunning())
				t2.stop();
			System.exit(0);

		}
	}
	ActionListener listener3 = new TimerStop();
	Timer t3 = new Timer(120000, listener3);
	t3.start();
	
	
	JOptionPane.showMessageDialog(null, "Please wait " );
	System.exit(0);
	
	
	
}

		
}