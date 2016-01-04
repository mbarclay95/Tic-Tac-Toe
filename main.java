package project5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;

public class main {

	private JFrame frame;
	private JTextField txtWins;
	private JTextField txtComputerWins;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
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
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		
		txtWins = new JTextField();
		txtWins.setText("Wins: ");
		panel.add(txtWins);
		txtWins.setColumns(10);
		
		txtComputerWins = new JTextField();
		txtComputerWins.setText("Computer Wins: ");
		panel.add(txtComputerWins);
		txtComputerWins.setColumns(10);
	}

}
