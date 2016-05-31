import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BarreColore extends JPanel {
	BarreGrise barreAssocie;
	JPanel barre;
	JPanel rectangle;
	JPanel zoneboutons;
	JButton r;
	JButton g;
	JButton b;
	
	public BarreColore(){
		barre=new JPanel();
		rectangle=new JPanel();
		zoneboutons=new JPanel();
		r=new JButton("R");
		g=new JButton("G");
		b=new JButton("B");
		addBoutonlistener();
		addRectangleListener();
		addBarreAssocieListener();
		barre.setPreferredSize(new Dimension(400,70));
		rectangle.setPreferredSize(new Dimension(200,40));
		r.setPreferredSize(new Dimension(50,40));
		g.setPreferredSize(new Dimension(50,40));
		b.setPreferredSize(new Dimension(50,40));
		rectangle.setBackground(new Color(220, 150, 183));
		zoneboutons.add(r,BorderLayout.WEST);
		zoneboutons.add(g);
		zoneboutons.add(b, BorderLayout.EAST);
		barre.add(rectangle);
		barre.add(zoneboutons,BorderLayout.EAST);
		this.add(barre);
		
		
	}
	public BarreColore(int r, int g ,int b){
		this();
		rectangle.setBackground(new Color(r,g,b));
	}
	public void addRectangleListener(){
		rectangle.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(e.getButton()==MouseEvent.BUTTON1){
					Palette palette=new Palette(rectangle);
					
					
				}
			}
		});
	}
	public void addBoutonlistener(){
	r.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Toolkit toolKit = Toolkit.getDefaultToolkit();
				Clipboard cb = toolKit.getSystemClipboard();
				cb.setContents(new StringSelection(""+rectangle.getBackground().getRed()), null);
				
			}
		});
	g.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Toolkit toolKit = Toolkit.getDefaultToolkit();
				Clipboard cb = toolKit.getSystemClipboard();
				cb.setContents(new StringSelection(""+rectangle.getBackground().getGreen()), null);
				
			}
		});
	b.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Toolkit toolKit = Toolkit.getDefaultToolkit();
			Clipboard cb = toolKit.getSystemClipboard();
			cb.setContents(new StringSelection(""+rectangle.getBackground().getBlue()), null);
			
		}
	});
	}
	public void addBarreAssocieListener(){
		
		rectangle.addPropertyChangeListener(new PropertyChangeListener() {
			
			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				int r=rectangle.getBackground().getRed();
				int g=rectangle.getBackground().getGreen();
				int b=rectangle.getBackground().getBlue();
				int gris=(int) (0.3*r+0.59*g+0.11*b);
				if(barreAssocie!=null){
					barreAssocie.rectangle.setBackground(new Color(gris, gris, gris));
				}
			}
		});
	}
	
	public void setBarreAssocie(BarreGrise b){
		barreAssocie=b;
	}
	public static void main(String[] args){
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
					BarreColore b = new BarreColore();
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
