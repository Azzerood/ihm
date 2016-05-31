import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;

public class Main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1053, 863);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmBookmarks = new JMenuItem("Bookmarks");
		mnFile.add(mntmBookmarks);
		frame.getContentPane().setLayout(null);
		
		PanneauBarres panneauBarres = new PanneauBarres();
		panneauBarres.setBounds(118, 60, 810, 710);
		frame.getContentPane().add(panneauBarres);
		
		JButton btnAddToBookmarks = new JButton("Add to bookmarks");
		btnAddToBookmarks.setBounds(131, 26, 139, 23);
		frame.getContentPane().add(btnAddToBookmarks);
	}
}
