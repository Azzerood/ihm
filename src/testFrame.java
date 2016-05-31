import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Panel;
import java.awt.Insets;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.SwingConstants;
import java.awt.TextField;

public class testFrame extends JFrame {
	private JMenuItem mntmChangerCouleur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testFrame frame = new testFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public testFrame() {
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("file");
		menuBar.add(mnNewMenu);
		
		mntmChangerCouleur = new JMenuItem("choisir couleur");
		mntmChangerCouleur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			}
		});
		mnNewMenu.add(mntmChangerCouleur);
		
		JMenu mnHelp = new JMenu("help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmTuto = new JMenuItem("tuto ");
		mnHelp.add(mntmTuto);
		getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		
		Panel panel_1 = new Panel();
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setToolTipText("");
		panel_2.setBounds(0, 21, 257, 42);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("up");
		btnNewButton.setBounds(0, 0, 59, 17);
		panel_2.add(btnNewButton);
		
		JButton btnDown = new JButton("down");
	
		btnDown.setBounds(0, 25, 59, 17);
		panel_2.add(btnDown);
		
		Panel panel_21 = new Panel();
		panel_21.setBackground(Color.GREEN);
		panel_21.setBounds(65, 10, 165, 25);
		panel_2.add(panel_21);
		
		JPanel panel_3 = new JPanel();
		panel_3.setToolTipText("");
		panel_3.setBounds(0, 63, 257, 42);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
	
		
	
		
		JButton button_8 = new JButton("down");
		button_8.setBounds(0, 25, 59, 17);
		panel_3.add(button_8);
		
		Panel panel_22 = new Panel();
		panel_22.setBackground(Color.YELLOW);
		panel_22.setBounds(65, 10, 165, 25);
		panel_3.add(panel_22);
		
		JPanel panel_4 = new JPanel();
		panel_4.setToolTipText("");
		panel_4.setBounds(0, 105, 257, 42);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JButton button_1 = new JButton("up");
		button_1.setBounds(0, 0, 59, 17);
		panel_4.add(button_1);
		
		JButton button_9 = new JButton("down");
		button_9.setBounds(0, 25, 59, 17);
		panel_4.add(button_9);
		
		Panel panel_23 = new Panel();
		panel_23.setBounds(65, 10, 165, 25);
		panel_4.add(panel_23);
		
		JPanel panel_5 = new JPanel();
		panel_5.setToolTipText("");
		panel_5.setBounds(0, 147, 257, 42);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JButton button_2 = new JButton("up");
		button_2.setBounds(0, 0, 59, 17);
		panel_5.add(button_2);
		
		JButton button_10 = new JButton("down");
		button_10.setBounds(0, 25, 59, 17);
		panel_5.add(button_10);
		
		Panel panel_24 = new Panel();
		panel_24.setBounds(65, 10, 165, 25);
		panel_5.add(panel_24);
		
		JPanel panel_6 = new JPanel();
		panel_6.setToolTipText("");
		panel_6.setBounds(0, 189, 257, 42);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		JButton button_3 = new JButton("up");
		button_3.setBounds(0, 0, 59, 17);
		panel_6.add(button_3);
		
		JButton button_11 = new JButton("down");
		button_11.setBounds(0, 25, 59, 17);
		panel_6.add(button_11);
		
		Panel panel_25 = new Panel();
		panel_25.setBounds(65, 10, 165, 25);
		panel_6.add(panel_25);
		
		JPanel panel_7 = new JPanel();
		panel_7.setToolTipText("");
		panel_7.setBounds(0, 231, 257, 42);
		panel_1.add(panel_7);
		panel_7.setLayout(null);
		
		JButton button_4 = new JButton("up");
		button_4.setBounds(0, 0, 59, 17);
		panel_7.add(button_4);
		
		JButton button_12 = new JButton("down");
		button_12.setBounds(0, 25, 59, 17);
		panel_7.add(button_12);
		
		Panel panel_26 = new Panel();
		panel_26.setBounds(65, 10, 165, 25);
		panel_7.add(panel_26);
		
		JPanel panel_8 = new JPanel();
		panel_8.setToolTipText("");
		panel_8.setBounds(0, 273, 257, 42);
		panel_1.add(panel_8);
		panel_8.setLayout(null);
		
		JButton button_5 = new JButton("up");
		button_5.setBounds(0, 0, 59, 17);
		panel_8.add(button_5);
		
		JButton button_13 = new JButton("down");
		button_13.setBounds(0, 25, 59, 17);
		panel_8.add(button_13);
		
		Panel panel_27 = new Panel();
		panel_27.setBounds(65, 10, 165, 25);
		panel_8.add(panel_27);
		
		JPanel panel_9 = new JPanel();
		panel_9.setToolTipText("");
		panel_9.setBounds(0, 315, 257, 42);
		panel_1.add(panel_9);
		panel_9.setLayout(null);
		
		JButton button_6 = new JButton("up");
		button_6.setBounds(0, 0, 59, 17);
		panel_9.add(button_6);
		
		JButton button_14 = new JButton("down");
		button_14.setBounds(0, 25, 59, 17);
		panel_9.add(button_14);
		
		Panel panel_28 = new Panel();
		panel_28.setBounds(65, 10, 165, 25);
		panel_9.add(panel_28);
		
		JPanel panel_10 = new JPanel();
		panel_10.setToolTipText("");
		panel_10.setBounds(0, 357, 257, 42);
		panel_1.add(panel_10);
		panel_10.setLayout(null);
		
		JButton button_7 = new JButton("up");
		button_7.setBounds(0, 0, 59, 17);
		panel_10.add(button_7);
		
		JButton button_15 = new JButton("down");
		button_15.setBounds(0, 25, 59, 17);
		panel_10.add(button_15);
		
		Panel panel_29 = new Panel();
		panel_29.setBounds(65, 10, 165, 25);
		panel_10.add(panel_29);
		
		Panel panel_11 = new Panel();
		panel.add(panel_11);
		panel_11.setLayout(null);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setToolTipText("");
		//if ( )
		panel_12.setBounds(0, 21, 257, 42);
		panel_11.add(panel_12);
		
		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setToolTipText("");
		panel_13.setBounds(0, 63, 257, 42);
		panel_11.add(panel_13);
		
		JPanel panel_14 = new JPanel();
		panel_14.setLayout(null);
		panel_14.setToolTipText("");
		panel_14.setBounds(0, 105, 257, 42);
		panel_11.add(panel_14);
		
		JPanel panel_15 = new JPanel();
		panel_15.setLayout(null);
		panel_15.setToolTipText("");
		panel_15.setBounds(0, 147, 257, 42);
		panel_11.add(panel_15);
		
		JPanel panel_16 = new JPanel();
		panel_16.setLayout(null);
		panel_16.setToolTipText("");
		panel_16.setBounds(0, 189, 257, 42);
		panel_11.add(panel_16);
		
		JPanel panel_17 = new JPanel();
		panel_17.setLayout(null);
		panel_17.setToolTipText("");
		panel_17.setBounds(0, 231, 257, 42);
		panel_11.add(panel_17);
		
		JPanel panel_18 = new JPanel();
		panel_18.setLayout(null);
		panel_18.setToolTipText("");
		panel_18.setBounds(0, 273, 257, 42);
		panel_11.add(panel_18);
		
		JPanel panel_19 = new JPanel();
		panel_19.setLayout(null);
		panel_19.setToolTipText("");
		panel_19.setBounds(0, 315, 257, 42);
		panel_11.add(panel_19);
		
		JPanel panel_20 = new JPanel();
		panel_20.setLayout(null);
		panel_20.setToolTipText("");
		panel_20.setBounds(0, 357, 257, 42);
		panel_11.add(panel_20);
		
		
		btnDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_3.add(panel_21);
				panel_2.add(panel_22);
				
			}
		});
		
		JButton button = new JButton("up");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_2.add(panel_21);
				panel_3.add(panel_22);
				button.getParent();
				
				
				
			}
		});
		button.setBounds(0, 0, 59, 17);
		panel_3.add(button);
		
		
	}

	public JMenuItem getMntmChangerCouleur() {
		return mntmChangerCouleur;
	}
}
