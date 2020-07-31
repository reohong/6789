package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Model.ListDAO;
import Model.ListDTO;
import Model.MembershipDAO;
import Model.MembershipDTO;

import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Reply_GUI {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Reply_GUI window = new Reply_GUI();
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
	public Reply_GUI(MembershipDTO dto) {
		initialize(dto);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(MembershipDTO dto) {
		
		String[] colName = {"ID","의견"};
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(33, 33, 238, 201);
		frame.getContentPane().add(scrollPane);
		
		
		JButton btnNewButton = new JButton("\uCD94\uAC00");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String reply;
				reply = JOptionPane.showInputDialog("의견을 남겨주세요 ~!");
				if(reply != null) {
					System.out.println(reply);
				//	DefaultTableModel m =
			                //(DefaultTableModel)table.getModel();
					
					String[] colname = {"아이디","댓글"};
					System.out.println(colname);
					Object[][] data = new Object[8][2];
					
					for (int i = 0; i < data.length; i++) {
						data[i][0] = dto.getId();
						data[i][1] = reply;
					}
					
					table = new JTable(data, colname);
					scrollPane.setViewportView(table);
				} 
			}
		});
		btnNewButton.setBounds(304, 55, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\uC0AD\uC81C");
		button.setBounds(304, 113, 97, 23);
		frame.getContentPane().add(button);
		
		JButton btnCnrk = new JButton("\uB2EB\uAE30");
		btnCnrk.setBounds(304, 174, 97, 23);
		frame.getContentPane().add(btnCnrk);
	

		String[] colname = {"왜","안되냐"};
		System.out.println(colname);
		Object[][] data = new Object[8][2];
		
		table = new JTable(data, colname);
		scrollPane.setViewportView(table);
		
		String temp_id = null;
		MembershipDAO dao = new MembershipDAO();
		MembershipDTO id = dao.name(temp_id);
		
		
		
		
		
		
	}
}
