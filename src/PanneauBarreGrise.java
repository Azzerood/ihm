import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanneauBarreGrise extends JPanel {
	JPanel panneau;
	static BarreGrise[]  data={
			new BarreGrise(),
			new BarreGrise(),
			new BarreGrise(),
			new BarreGrise(),
			new BarreGrise(),
			new BarreGrise(),
			new BarreGrise(),
			new BarreGrise(),
			new BarreGrise(),
			new BarreGrise()};
	
	
	public PanneauBarreGrise(){
	panneau=new JPanel();
	panneau.setPreferredSize(new Dimension(450,700));
	panneau.setLayout(new BoxLayout(panneau, BoxLayout.Y_AXIS));
	for(int cpt=0;cpt<10;cpt++){
	panneau.add(data[cpt]);
	}
	
	this.add(panneau);
	}
	
	
	public BarreGrise getBarreColore(int x){
		return data[x];
		
	}
	public void linkAll(BarreColore[] tab){
		for(int cpt=0;cpt<tab.length;cpt++){
			data[cpt].setBarreAssocie(tab[cpt]);
		}
	}
	
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				PanneauBarreGrise b = new PanneauBarreGrise();
					
					JFrame j=new JFrame();
					
					j.getContentPane().add(new JPanel().add(b));;
					j.setPreferredSize(new Dimension(400,800));
					j.pack();
					j.setLocationRelativeTo(null);
					j.setVisible(true);
				
			}
		});
	}
}
