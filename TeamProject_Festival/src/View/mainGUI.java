package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class mainGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				mainGUI window = new mainGUI();
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
	public mainGUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 643, 519);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC870\uC774\uB984");
		lblNewLabel.setFont(new Font("HY¿±¼­M", Font.PLAIN, 18));
		lblNewLabel.setBounds(272, 22, 91, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("\uCD95\uC81C");
		label.setFont(new Font("HY¿±¼­M", Font.PLAIN, 18));
		label.setBounds(50, 69, 91, 15);
		frame.getContentPane().add(label);
		
		JLabel label_2 = new JLabel("\uAC8C\uC2DC\uD310");
		label_2.setFont(new Font("HY¿±¼­M", Font.PLAIN, 18));
		label_2.setBounds(473, 69, 91, 15);
		frame.getContentPane().add(label_2);
		
		JButton btnNewButton = new JButton("\uACF5\uAC04\uB300\uC5EC");
		btnNewButton.setFont(new Font("HY¿±¼­M", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				place_FestivalGUI pf = new place_FestivalGUI();
				
			}
		});
		btnNewButton.setBounds(224, 63, 152, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(Color.YELLOW);
		lblNewLabel_1.setBounds(40, 111, 533, 121);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("\uCD95\uC81C \uB4F1\uB85D\uD558\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				Join_Festival jf = new Join_Festival();
			}
		});
		btnNewButton_1.setFont(new Font("HY¿±¼­M", Font.PLAIN, 18));
		btnNewButton_1.setBounds(374, 160, 190, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel label_1 = new JLabel("");
		label_1.setBackground(Color.YELLOW);
		label_1.setBounds(50, 231, 512, 108);
		frame.getContentPane().add(label_1);
		
		JLabel label_3 = new JLabel("");
		label_3.setBackground(Color.YELLOW);
		label_3.setBounds(50, 362, 533, 108);
		frame.getContentPane().add(label_3);
		
		JButton btnNewButton_2 = new JButton("\uC774\uBBF8\uC9C01");
		btnNewButton_2.setFont(new Font("HY¿±¼­M", Font.PLAIN, 18));
		btnNewButton_2.setBounds(50, 264, 158, 61);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton button_2 = new JButton("\uC774\uBBF8\uC9C02");
		button_2.setFont(new Font("HY¿±¼­M", Font.PLAIN, 18));
		button_2.setBounds(205, 264, 158, 61);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("\uC774\uBBF8\uC9C03");
		button_3.setFont(new Font("HY¿±¼­M", Font.PLAIN, 18));
		button_3.setBounds(362, 264, 158, 61);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("\uC774\uBBF8\uC9C01");
		button_4.setFont(new Font("HY¿±¼­M", Font.PLAIN, 18));
		button_4.setBounds(50, 391, 158, 61);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("\uC774\uBBF8\uC9C02");
		button_5.setFont(new Font("HY¿±¼­M", Font.PLAIN, 18));
		button_5.setBounds(205, 391, 158, 61);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("\uC774\uBBF8\uC9C03");
		button_6.setFont(new Font("HY¿±¼­M", Font.PLAIN, 18));
		button_6.setBounds(362, 391, 158, 61);
		frame.getContentPane().add(button_6);
		
		JButton btnNewButton_3 = new JButton("\uB354 \uBCF4\uAE30");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				festivalInfoGUI festivalInfo = new festivalInfoGUI();
			}
		});
		btnNewButton_3.setFont(new Font("HY¿±¼­M", Font.PLAIN, 14));
		btnNewButton_3.setBounds(518, 285, 97, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton button_7 = new JButton("\uB354 \uBCF4\uAE30");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				List_GUI lg = new List_GUI();
			}
		});
		button_7.setFont(new Font("HY¿±¼­M", Font.PLAIN, 14));
		button_7.setBounds(518, 412, 97, 23);
		frame.getContentPane().add(button_7);
		
		JLabel lblNewLabel_2 = new JLabel("\uC9C4\uD589\uC911\uC778 \uCD95\uC81C");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("HY¿±¼­M", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(50, 242, 190, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel label_4 = new JLabel("\uC608\uC815\uC911\uC778 \uCD95\uC81C");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("HY¿±¼­M", Font.PLAIN, 18));
		label_4.setBounds(50, 366, 190, 15);
		frame.getContentPane().add(label_4);
	}
}