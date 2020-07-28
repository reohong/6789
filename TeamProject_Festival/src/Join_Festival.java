import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Join_Festival {

	private JFrame frame;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Join_Festival window = new Join_Festival();
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
	public Join_Festival() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 455, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uCD95\uC81C\uB4F1\uB85D");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 415, 56);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uCD95\uC81C\uBA85 : ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 60, 93, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("\uCD95\uC81C \uB0A0\uC9DC : ");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(12, 122, 93, 30);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\uC608\uC815 \uC7A5\uC18C : ");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(12, 162, 93, 30);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\uCD95\uC81C \uD14C\uB9C8 : ");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(12, 228, 93, 30);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("\uCD5C\uC18C\uC778\uC6D0 : ");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(12, 293, 93, 30);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\uCD95\uC81C \uAE30\uD68D\uC758\uB3C4 : ");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(12, 388, 93, 30);
		frame.getContentPane().add(label_4);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(99, 60, 328, 21);
		frame.getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(99, 122, 328, 21);
		frame.getContentPane().add(textPane_1);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(12, 428, 415, 139);
		frame.getContentPane().add(textPane_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uAD11\uC8FC \uB3D9\uAD6C");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(99, 162, 93, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton radioButton = new JRadioButton("\uAD11\uC8FC \uB0A8\uAD6C");
		buttonGroup.add(radioButton);
		radioButton.setBounds(310, 162, 93, 23);
		frame.getContentPane().add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("\uAD11\uC8FC \uBD81\uAD6C");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(99, 194, 93, 23);
		frame.getContentPane().add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("\uAD11\uC8FC \uC11C\uAD6C");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(196, 162, 93, 23);
		frame.getContentPane().add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("\uAD11\uC8FC \uAD11\uC0B0\uAD6C");
		buttonGroup.add(radioButton_3);
		radioButton_3.setBounds(196, 194, 93, 23);
		frame.getContentPane().add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("\uAE30\uD0C0");
		buttonGroup.add(radioButton_4);
		radioButton_4.setBounds(310, 194, 93, 23);
		frame.getContentPane().add(radioButton_4);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\uC7AC\uB2A5 \uAE30\uBD80");
		buttonGroup_1.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(99, 232, 84, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton radioButton_5 = new JRadioButton("\uBC84\uC2A4\uD0B9");
		buttonGroup_1.add(radioButton_5);
		radioButton_5.setBounds(196, 232, 84, 23);
		frame.getContentPane().add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("\uCCB4\uD5D8");
		buttonGroup_1.add(radioButton_6);
		radioButton_6.setBounds(310, 232, 84, 23);
		frame.getContentPane().add(radioButton_6);
		
		JRadioButton radioButton_7 = new JRadioButton("\uD50C\uB9AC\uB9C8\uCF13");
		buttonGroup_1.add(radioButton_7);
		radioButton_7.setBounds(99, 264, 84, 23);
		frame.getContentPane().add(radioButton_7);
		
		JRadioButton radioButton_8 = new JRadioButton("\uB610 \uBB50\uAC00 \uC788\uC744\uAE4C");
		buttonGroup_1.add(radioButton_8);
		radioButton_8.setBounds(196, 264, 84, 23);
		frame.getContentPane().add(radioButton_8);
		
		JRadioButton radioButton_9 = new JRadioButton("\uAE30\uD0C0");
		buttonGroup_1.add(radioButton_9);
		radioButton_9.setBounds(310, 264, 84, 23);
		frame.getContentPane().add(radioButton_9);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(10);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"~5\uBA85", "~10\uBA85", "~15\uBA85", "~20\uBA85", "~25\uBA85", "~30\uBA85", "~35\uBA85", "~40\uBA85", "~45\uBA85", "~50\uBA85"}));
		comboBox.setBounds(99, 298, 276, 25);
		frame.getContentPane().add(comboBox);
		
		JRadioButton radioButton_11 = new JRadioButton("\uC544\uC774\uB3D9\uBC18");
		radioButton_11.setBounds(310, 329, 84, 23);
		frame.getContentPane().add(radioButton_11);
		
		JRadioButton radioButton_12 = new JRadioButton("\uAE30\uD0C0");
		radioButton_12.setBounds(196, 361, 84, 23);
		frame.getContentPane().add(radioButton_12);
		
		JRadioButton radioButton_13 = new JRadioButton("20,30\uB300");
		radioButton_13.setBounds(196, 329, 84, 23);
		frame.getContentPane().add(radioButton_13);
		
		JRadioButton radioButton_14 = new JRadioButton("\uBC18\uB824\uB3D9\uBB3C");
		radioButton_14.setBounds(99, 361, 84, 23);
		frame.getContentPane().add(radioButton_14);
		
		JRadioButton radioButton_15 = new JRadioButton("\uCCAD\uC18C\uB144");
		radioButton_15.setBounds(99, 329, 84, 23);
		frame.getContentPane().add(radioButton_15);
		
		JLabel label_5 = new JLabel("\uB300\uC0C1\uC790 : ");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(12, 329, 93, 30);
		frame.getContentPane().add(label_5);
		
		JButton btnNewButton = new JButton("\uB4F1\uB85D\uD558\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				//main ³ª¿À°Ô
			}
		});
		btnNewButton.setBounds(99, 590, 235, 47);
		frame.getContentPane().add(btnNewButton);
	}
}
