package holaam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class holasasa {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					holasasa window = new holasasa();
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
	public holasasa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblaHOLA = new JLabel("HOLA");
		lblaHOLA.setBounds(82, 57, 308, 121);
		frame.getContentPane().add(lblaHOLA);
	}
}
