package View;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;


import javax.swing.SwingConstants;

import Model.ListDAO;

public class More_GUI {

	private JFrame frame;
	private JTextField F_name;
	private List_GUI me;
	private JTextField txt_info;
	int sum;
	int sum_money;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					More_GUI window = new More_GUI();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public More_GUI(String f,int n) {//(String name)
		initialize(f, n);
		//(name)
		frame.setVisible(true);
	}
//	public More_GUI(List_GUI me, String index){
////		super(me,"���̾�α�");
//		this.me=me;
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String f,int n) {//(String name)
		frame = new JFrame();
		frame.setBounds(100, 100, 501, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//System.out.println(n+"More_GUI�� n ���� �����ϸ�ǰ���?");
		JLabel Now_num = new JLabel("���� �ο��� "+n+"�� �Դϴ�!" );
		Now_num.setHorizontalAlignment(SwingConstants.CENTER);
		Now_num.setBounds(61, 258, 169, 29);
		frame.getContentPane().add(Now_num);
	
		
		sum = n;
		JButton btn_join = new JButton("\uCC38\uC5EC\uD558\uAE30");
		btn_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null,"�����Ͻðڽ��ϱ�?","��������",
						JOptionPane.YES_NO_OPTION);
				
				if(result == JOptionPane.YES_OPTION) {
					sum = sum + 1;
					Now_num.setText("���� �ο��� "+(sum)+"�� �Դϴ�!");
					
				}else if(result == JOptionPane.NO_OPTION) {
					Now_num.setText("���� �ο��� "+(sum)+"�� �Դϴ�!");
				}System.out.println(sum);
				}
		}); 
		
		
		
		btn_join.setBounds(51, 297, 97, 23);
		frame.getContentPane().add(btn_join);
		
		JLabel Now_money = new JLabel("�Ŀ��ݾ��� 0�� �Դϴ�!");
		Now_money.setHorizontalAlignment(SwingConstants.CENTER);
		Now_money.setBounds(246, 258, 169, 29);
		frame.getContentPane().add(Now_money);
		
		
		JButton btn_support = new JButton("\uD6C4\uC6D0\uD558\uAE30");
		btn_support.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Support, result;
				Support = JOptionPane.showInputDialog("�Ŀ� �ݾ��� �Է��Ͻÿ� >>");
				int money = Integer.parseInt(Support);
				if (money > 0) {
					result = "�Ŀ� ����帳�ϴ� ��";
					JOptionPane.showMessageDialog(null,result);
					sum_money +=money;
					Now_money.setText("�Ŀ��ݾ��� "+sum_money+"�� �Դϴ�!");
				}else if(money<0){
					result = "�ݾ��� �Է��� �ּ���!";
					JOptionPane.showMessageDialog(null,result);
				}
				
			}
		});
		btn_support.setBounds(190, 297, 97, 23);
		frame.getContentPane().add(btn_support);
		
		JButton btn_comment = new JButton("\uC758\uACAC\uB0A8\uAE30\uAE30");
		btn_comment.setBounds(328, 297, 97, 23);
		frame.getContentPane().add(btn_comment);
		
		JButton btn_back = new JButton("\uB4A4\uB85C\uAC00\uAE30  \uBC0F \uCC3D \uB2EB\uAE30");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				ListDAO dao = new ListDAO();
				dao.Update_num(sum, f);
				List_GUI list_gui = new List_GUI();
				
			}
		});
		btn_back.setBounds(134, 333, 210, 23);
		frame.getContentPane().add(btn_back);
		
		F_name = new JTextField(f);
		F_name.setHorizontalAlignment(SwingConstants.CENTER);
		F_name.setBounds(128, 20, 220, 34);
		frame.getContentPane().add(F_name);
		F_name.setColumns(10);
		
		JLabel img_info = new JLabel("\uC0AC\uC9C4 \uC0BD\uC785");
		img_info.setBounds(236, 82, 189, 163);
		frame.getContentPane().add(img_info);
		
		txt_info = new JTextField();
		txt_info.setColumns(10);
		txt_info.setBounds(51, 82, 181, 163);
		frame.getContentPane().add(txt_info);
		

		

	}
}
