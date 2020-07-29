package Place_FestivalGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class place_infoGUI {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					place_infoGUI window = new place_infoGUI();
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
	public place_infoGUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 455, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC5C5\uCCB4 \uC815\uBCF4");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(67, 10, 304, 59);
		frame.getContentPane().add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(12, 101, 415, 38);
		frame.getContentPane().add(table);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 217, 415, 250);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("\uC5C5\uCCB4 \uC18C\uAC1C");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 186, 86, 21);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
