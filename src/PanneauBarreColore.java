import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanneauBarreColore extends JPanel{
	JPanel panneau;
	static BarreColore[]  data={
			new BarreColore(0,0,0),
			new BarreColore(51,0,255),
			new BarreColore(204,0,204),
			new BarreColore(255,51,0),
			new BarreColore(51,204,0),
			new BarreColore(51,255,204),
			new BarreColore(153,255,153),
			new BarreColore(204,255,51),
			new BarreColore(204,255,204),
			new BarreColore(255,255,255),};
			
		
	public PanneauBarreColore(){
		panneau=new JPanel();
		panneau.setPreferredSize(new Dimension(400,700));
		panneau.setLayout(new BoxLayout(panneau, BoxLayout.Y_AXIS));
		for(int cpt=0;cpt<10;cpt++){
		panneau.add(data[cpt]);
		}
		
		this.add(panneau);
		
	}
	public BarreColore getBarreColore(int x){
		return data[x];
		
	}
	public void linkAll(BarreGrise[] tab){
		for(int cpt=0;cpt<tab.length;cpt++){
			data[cpt].setBarreAssocie(tab[cpt]);
		}
	}
	
		
	
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				PanneauBarreColore b = new PanneauBarreColore();
					
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
