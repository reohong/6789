package View;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Model.place_DAO;
import Model.place_DTO;

import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class place_infoGUI {

	private JFrame frame;
	String name2;
	private JTable table;

	/**
	 * Launch the application.
	 */
   	/* public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					place_infoGUI window = new place_infoGUI(name2);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	} */

	/**
	 * Create the application.
	 */
	public place_infoGUI(String name2) {
		initialize(name2);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 * @param name2 
	 */
	private void initialize(String name2) {
		frame = new JFrame();
		frame.setBounds(100, 100, 455, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC5C5\uCCB4 \uC815\uBCF4");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(67, 10, 304, 59);
		frame.getContentPane().add(lblNewLabel);
		
		String [] colName = {"업체명","주소", "전화번호","홈페이지"};
		
		place_DAO dao = new place_DAO();
			ArrayList<place_DTO> memberList2 = dao.selectInfo(name2);
			
			Object [][] data = new Object[memberList2.size()][4]; //2차원 배열 형성
		for(int i=0; i<data.length;i++) {
			data[i][0] = memberList2.get(i).getName();
			data[i][1] = memberList2.get(i).getAddress();
			data[i][2] = memberList2.get(i).getTel();
			data[i][3] = memberList2.get(i).getHomepage();
			}
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 217, 415, 250);
		frame.getContentPane().add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("\uC5C5\uCCB4 \uC18C\uAC1C");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 186, 86, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 67, 415, 96);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable(data,colName);
		scrollPane.setViewportView(table);
	}
}
