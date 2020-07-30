package View;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Model.festivalDAO;
import Model.festivalDTO;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class festivalInfoGUI {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					festivalInfoGUI window = new festivalInfoGUI();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public festivalInfoGUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 621, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uCD95\uC81C \uBAA9\uB85D");
		lblNewLabel.setFont(new Font("HY엽서M", Font.PLAIN, 18));
		lblNewLabel.setBounds(281, 30, 96, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 61, 554, 256);
		frame.getContentPane().add(scrollPane);
		
		String[] colName = {"번호", "축제명", "날짜", "장소", "테마"};
		festivalDAO dao = new festivalDAO();
		ArrayList<festivalDTO> memberList = dao.festivalSelect();
		Object[][] data = new Object[memberList.size()][5];
		int num=1;
		for(int i = 0; i < data.length; i++) {
			data[i][0] = num;
			data[i][1] = memberList.get(i).getFtitle();
			data[i][2] = memberList.get(i).getFdate();
			data[i][3] = memberList.get(i).getFlocation();
			data[i][4] = memberList.get(i).getFtheme();
			num++;
		}
		
		
		table = new JTable(data, colName);
		scrollPane.setViewportView(table);
		
		JButton btnNewButton = new JButton("\uB2EB\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("HY엽서M", Font.PLAIN, 18));
		btnNewButton.setBounds(27, 347, 554, 45);
		frame.getContentPane().add(btnNewButton);
	}
}
