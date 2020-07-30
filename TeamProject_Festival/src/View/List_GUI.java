package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import Model.ListDAO;
import Model.ListDTO;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class List_GUI {

	private JFrame frame;
	private String festivalname;
	/**
	 * @wbp.nonvisual location=110,9
	 */
	private final JPanel panel = new JPanel();
	private JTable table;


	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					List_GUI window = new List_GUI();
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
	public List_GUI() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 531, 339);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Festival LIst");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel.setBounds(181, 21, 164, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 59, 488, 192);
		frame.getContentPane().add(scrollPane);
		
		JButton btnNewButton = new JButton("\uB2EB \uAE30");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setBounds(212, 261, 97, 23);
		frame.getContentPane().add(btnNewButton);
		
		String[] colName = {"번호","축제명","예정날짜","예정장소","테마정보","정원","현재인원"};
		ListDAO dao = new ListDAO();
		ArrayList<ListDTO> FestivalList = dao.Festivalinfo();
		Object[][] data = new Object[FestivalList.size()][7];
		int num=1;
		for(int i=0;i<data.length;i++) {
			data[i][0]=num;
			data[i][1]=FestivalList.get(i).getName();
			data[i][2]=FestivalList.get(i).getDay();
			data[i][3]=FestivalList.get(i).getLoc();
			data[i][4]=FestivalList.get(i).getTheme();
			data[i][5]=FestivalList.get(i).getNum();
			data[i][6]=FestivalList.get(i).getN_num();
			num++;
			
		}
		
		
		table = new JTable(data,colName);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index = table.getSelectedRow();
				TableModel model = table.getModel();
				String f = (String) model.getValueAt(index, 1);
				int n = (int) model.getValueAt(index, 6);
				//System.out.println(n+"List gui의 n");
				More_GUI more = new More_GUI(f,n);
				frame.dispose();

			}
		});
		scrollPane.setViewportView(table);
	}
	
//	public void JTableUpdate(int cnt) {
//
//		
//	}
}
