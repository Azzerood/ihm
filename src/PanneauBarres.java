import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanneauBarres extends JPanel {
JPanel central;
	public PanneauBarres(){
	central=new JPanel();
	PanneauBarreColore pbc=new PanneauBarreColore();
	PanneauBarreGrise pbg=new PanneauBarreGrise();
	central.setPreferredSize(new Dimension(800, 700));
	central.setLayout(new BoxLayout(central, BoxLayout.X_AXIS));
	central.add(pbc);
	central.add(pbg);
	pbc.linkAll(pbg.data);
	pbg.linkAll(pbc.data);
	this.add(central);
	}
	
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
					PanneauBarres b = new PanneauBarres();
					JFrame j=new JFrame();	
					j.getContentPane().add(new JPanel().add(b));;
					j.setPreferredSize(new Dimension(900,800));
					j.pack();
					j.setLocationRelativeTo(null);
					j.setVisible(true);
				
			}
		});
	}
}
