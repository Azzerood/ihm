import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BarreGrise extends JPanel{
	BarreColore barreAssocie;
	JPanel barre;
	JPanel rectangle;
	
	public BarreGrise(){
		barre=new JPanel();
		rectangle=new JPanel();
		rectangle.setBackground(new Color(150,150,150));
		rectangle.setPreferredSize(new Dimension(200,40));
		
		barre.add(rectangle);
		this.add(barre);
	}
	
	public void setBarreAssocie(BarreColore b){
		barreAssocie=b;
	}
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
					BarreGrise b = new BarreGrise();
					b.setBackground(new Color(150,25,35));
					JFrame j=new JFrame();
					j.getContentPane().add(b);
					j.setPreferredSize(new Dimension(400,100));
					j.pack();
					j.setLocationRelativeTo(null);
					j.setVisible(true);
				
			}
		});
	}
}
