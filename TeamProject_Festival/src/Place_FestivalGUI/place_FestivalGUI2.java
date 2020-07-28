package Place_FestivalGUI;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTable;

import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class place_FestivalGUI2  {

	private JFrame frame;
	private JTable table;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JButton button;
	
	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					place_FestivalGUI2 window = new place_FestivalGUI2();
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
	public place_FestivalGUI2(String gegu) {
		initialize(gegu);
		frame.setVisible(true);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String gegu) {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 72, 476, 336);
		frame.getContentPane().add(scrollPane);
		
		String [] colName = {"NUM", "GEGU","Name","Address"};
		
		place_DAO dao = new place_DAO();
		place_FestivalGUI festgui = new place_FestivalGUI();
		
			ArrayList<place_DTO> memberList = dao.selectPlace(gegu);
			Object [][] data = new Object[memberList.size()][4]; //2차원 배열 형성
		for(int i=0; i<data.length;i++) {
			data[i][0] = memberList.get(i).getNum();
			data[i][1] = memberList.get(i).getGegu();
			data[i][2] = memberList.get(i).getName();
			data[i][3] = memberList.get(i).getAddress();
			}
		
		table = new JTable(data,colName);
		scrollPane.setViewportView(table);
		
		btnNewButton = new JButton("\uB2EB\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setBounds(279, 435, 185, 52);
		frame.getContentPane().add(btnNewButton);
		
		lblNewLabel = new JLabel("<\uC5C5\uCCB4 \uBAA9\uB85D>");
		lblNewLabel.setBounds(12, 10, 116, 32);
		frame.getContentPane().add(lblNewLabel);
		
		button = new JButton("\uC774\uC804\uC73C\uB85C \uB3CC\uC544\uAC00\uAE30");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				place_FestivalGUI gui = new place_FestivalGUI();
			}
		});
		button.setBounds(12, 435, 185, 52);
		frame.getContentPane().add(button);
		}
	

}
