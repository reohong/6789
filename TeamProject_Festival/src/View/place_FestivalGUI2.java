package View;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Desktop;

import javax.swing.JTable;

import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableModel;

import Model.place_DAO;
import Model.place_DTO;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class place_FestivalGUI2  
{

	private JFrame frame;
	private JTable table;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JButton button;
	String model2;

	
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
	}  */

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
		frame.setBounds(100, 100, 553, 556);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 63, 476, 336);
		frame.getContentPane().add(scrollPane);
		
		String [] colName = {"번호", "지역구","업체명","업체주소"};
		
		place_DAO dao = new place_DAO();
			ArrayList<place_DTO> memberList = dao.selectPlace(gegu);
			Object [][] data = new Object[memberList.size()][4]; //2차원 배열 형성
			int num = 1;
			for(int i=0; i<data.length;i++) {
			data[i][0] = num;
			data[i][1] = memberList.get(i).getGegu();
			data[i][2] = memberList.get(i).getName();
			data[i][3] = memberList.get(i).getAddress();
			num ++;
			}
		
		table = new JTable(data,colName);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int index = table.getSelectedRow();
				TableModel model = table.getModel();
				 model2 = (String)table.getValueAt(index, 2);
				
				 
			}
		});
		scrollPane.setViewportView(table);
		
		btnNewButton = new JButton("\uB2EB\uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setBounds(353, 444, 111, 43);
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
		button.setBounds(12, 435, 133, 52);
		frame.getContentPane().add(button);
		
		JButton btnNewButton_1 = new JButton("\uB354\uBCF4\uAE30");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0;i<table.getRowCount();i++) {
					if(model2.equals(data[i][2])) {
						place_infoGUI info = new place_infoGUI(model2);
					}
				}
			}
		});
		btnNewButton_1.setBounds(181, 444, 116, 43);
		frame.getContentPane().add(btnNewButton_1);
		
	}

}
